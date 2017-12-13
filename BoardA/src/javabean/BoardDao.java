package javabean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BoardUtil.DBConnect;

public class BoardDao {
	private static BoardDao dao;
	
	private BoardDao() {
		
	}
	
	public static BoardDao getInstance() {
		if(dao == null) {
			dao = new BoardDao();
		}
		return dao;
	}
	//게시물 등록
	public void insert(BoardDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		conn = new DBConnect().getConn();
		String sql = "insert into boardA (number,cname,ctitle,ccontents,date,views)"
				+ "values(?,?,?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getNumber());
			pstmt.setString(2, dto.getCname());
			pstmt.setString(3, dto.getCtitle());
			pstmt.setString(4, dto.getCcontents());
			pstmt.setString(5, dto.getDatee());
			pstmt.setString(6, dto.getViews());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	//게시물 목록
	public List<BoardDto> boardlist (){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
		List<BoardDto> list=new ArrayList<>();
		conn = new DBConnect().getConn();
		String sql = "select * from boardA";
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		while(rs.next()) {
			String number = rs.getString("number");
			String cname = rs.getString("cname");
			String ctitle = rs.getString("ctitle");
			String ccontents = rs.getString("ccntents");
			String datee = rs.getString("datee");
			String views = rs.getString("views");
		
			BoardDto dto=new BoardDto(number, cname, ctitle, ccontents, datee, views);
			list.add(dto);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}catch(Exception e) {}
	}
	return null;
	}
	
}

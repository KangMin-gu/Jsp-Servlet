package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.FriendsDto;
import test.util.DBConnect;

public class FriendsDao {
	private static FriendsDao dao;

	// 외부에서 객체 생성하지 못하게
	private FriendsDao() {
	}

	// 참조값을 리턴해주는 메소드
	public static FriendsDao getInstance() {
		if (dao == null) {
			dao = new FriendsDao();
		}
		return dao;
	}
	//친구 수정
	public boolean update(FriendsDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		boolean isSuccess=false;//저장 성공여부
		conn = new DBConnect().getConn();
		String sql = "update member set name =?, phone =? where num=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPhone());
			pstmt.setInt(3, dto.getNum());
			
			
			int flag = pstmt.executeUpdate();
			if(flag>0) {
				isSuccess=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
			}
		}
		return false;
	}

	// 회원 한명의 정보를 리턴해 주는 메소드
	public FriendsDto getData(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		FriendsDto dto = null;
		try {
			conn = new DBConnect().getConn();
			String sql = "SELECT num,name,phone FROM member " + "where num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String regdate = rs.getString("regdate");
				// 회원정보를 MemberDto 에 담고
				dto = new FriendsDto(num, name, phone, regdate);
				// ArrayList 객체에 누적 시킨다.
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return dto;
	}
	//친구 삭제
	public void delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt= null;
		try {
			conn=new DBConnect().getConn();
			String sql = "delete from friends where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
	}
	//친구추가
	public void insert(FriendsDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = new DBConnect().getConn();
		String sql="insert into Friends values (fs.nextval,?,?,sysdate)";
			pstmt =conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPhone());
			
			pstmt.executeUpdate();
			
			System.out.println("ddd"+dto.getName());
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
				try {
					if(conn != null)
					conn.close();
					if(pstmt != null)
						pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
	}
	
//친구목록
	public List<FriendsDto> getlist() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<FriendsDto> list = new ArrayList<>();
		try {
			conn = new DBConnect().getConn();
			String sql = "Select num, name, phone, regdate from friends";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String regdate = rs.getString("regdate");

				FriendsDto dto = new FriendsDto(num, name, phone, regdate);
				list.add(dto);
			}
						
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.cancel();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}

package test.users.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;

import test.users.dto.UsersDto;
import test.util.DbcpBean;

public class UsersDao {
	private static UsersDao dao;
	
	private UsersDao() {
		
	}
	
	public static UsersDao getInstance() {
		if(dao==null) {
			dao=new UsersDao();
		}
	return dao;
	}
	
	//아이디 비밀번호가 유효한지 여부를 리턴하는 메소드
	public boolean isValid(UsersDto dto){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//아이디와 비밀번호가 맞는 정보인지 여부 
		boolean isValid=false;
		try {
			conn = new DbcpBean().getConn();
			String sql = "SELECT * FROM users"
					+ " WHERE id=? AND pwd=?";
			pstmt = conn.prepareStatement(sql);
			//? 에 아이디와 비밀번호를 바인딩하고 
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPwd());
			//SELECT 해서 
			rs = pstmt.executeQuery();
			while (rs.next()) {//row 가 하나라도 있으면 
				isValid=true; //유효한 정보이다. 
			}
		} catch (SQLException se) {
			se.printStackTrace();
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
		//아이디 비밀번호가 유효한 정보인지 여부를 리턴해준다.
		return isValid;
	}//isValid()
	
	public boolean insert(UsersDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		try {
			conn = new DbcpBean().getConn();
			String sql = "insert into users"
					+ "(id, pwd, email, regdate)"
					+ "values (?,?,?,sysdate)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPwd());
			pstmt.setString(3, dto.getEmail());
			
			//sql 문 수행하고 결과셋 받아오기 
			int flag = pstmt.executeUpdate();
			if (flag > 0) {
				isSuccess = true;
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return isSuccess;
	}
	
}

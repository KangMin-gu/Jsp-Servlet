package javabean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import memberUtil.ConnConnect;

public class MemberDao {
	private static MemberDao dao;

	private MemberDao() {

	}

	public static MemberDao getInstance() {
		if (dao == null) {
			dao = new MemberDao();
		}
		return dao;
	}

	// ----------------------------------------------------
	// DB에 회원정보를 저장하는 메소드
	public void insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = new ConnConnect().getConn();
			String sql = "insert into member (userid, usernm, password, jumin1,jumin2,mailrcv,gender,job,intro) "
					+ "values (?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getUserid());
			pstmt.setString(2, dto.getUsernm());
			pstmt.setString(3, dto.getPassword());
			pstmt.setString(4, dto.getJumin1());
			pstmt.setString(5, dto.getJumin2());
			pstmt.setString(6, dto.getMailrcv());
			pstmt.setString(7, dto.getGender());
			pstmt.setString(8, dto.getJob());
			pstmt.setString(9, dto.getIntro());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

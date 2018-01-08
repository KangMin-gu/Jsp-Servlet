package test.file.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.file.dto.FileDto;
import test.mybatis.SqlMapConfig;

public class FileDao {
	private static SqlSessionFactory factory;
	private static FileDao dao;
	private FileDao() {}
	//FileDao 객체를 리턴해주는 static 맴버 메소드
	public static FileDao getInstance() {
		if(dao==null) {
			dao=new FileDao();
			factory=SqlMapConfig.getSqlSession();
		}
		return dao;
	}
	//파일 정보를 저장하는 메소드
	public void insert(FileDto dto) {
		SqlSession session=null;
		try {
			session=factory.openSession(true);
			session.insert("file.insert", dto);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	
	//파일 목록을 리턴해주는 메소드
	public List<FileDto> getList(){
		SqlSession session=null;
		List<FileDto> list=null;
		try {
			session=factory.openSession();
			list=session.selectList("file.getList");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
}
















package test.file.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.file.dto.FileDto;
import test.mybatis.SqlMapConfig;

public class FileDao {
	private static FileDao dao;
	private static SqlSessionFactory factory;
	
	private FileDao() {}
	
	public static FileDao getInstance() {
		if(dao == null) {
			dao = new FileDao();
			factory = SqlMapConfig.getSqlSession();
		}
		return dao;
	}
	
//파일을 등록하는 메소드
	public void insert(FileDto dto) {
		SqlSession session = null;
		try {
			session = factory.openSession(true);
			session.insert("File.insert", dto);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	
//파일 목록을 리턴해주는 메소드	
	public List<FileDto> getList(FileDto dto){
		//DB 관련된 작업을 할 객체
		SqlSession session= null;
		List<FileDto> list = null;
		try {
			session = factory.openSession();
			list = session.selectList("File.getList", dto);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
	
}


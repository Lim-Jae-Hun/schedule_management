package kr.co.zzaehoonx2;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MySQLConnectionTest {

//	@Inject
//	private DataSource ds;
//
//	@Test
//	public void testConnection() throws Exception {
//		try (Connection con = ds.getConnection()) {
//			System.out.println("Connection : " + con + " \n");
//		} catch (Exception e) {
//			e.printStackTrace(); 
//		}; 
//	}

	@Inject
	private SqlSessionFactory sqlFactory;

	@Test
	public void testFactory() throws Exception {
		System.out.println("Mybatis Connection : " + sqlFactory);
	}

	@Test
	public void testSession() throws Exception {
		try (SqlSession sqlSession = sqlFactory.openSession()) {
			System.out.println(sqlSession);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

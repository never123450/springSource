package xwy.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import xwy.aop.dao.MemberDao;

@ContextConfiguration(locations = {"classpath*:application-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MemberDaoTest {

	@Autowired MemberDao memberDao ;
	
	@Test
	public void testInsert() {
		memberDao.isnert();
	}
}

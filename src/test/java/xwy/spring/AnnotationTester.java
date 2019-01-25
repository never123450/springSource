package xwy.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import xwy.aop.service.MemberMamgerService;

@ContextConfiguration(locations = { "classpath*:application-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class AnnotationTester {

	@Autowired
	MemberMamgerService mamgerService;

	@Test
	public void testAdd() {
		mamgerService.add(null);
	}


	
	@Test
	public void testRemove() {
		try {
			mamgerService.remove((long) 0);
		} catch (Exception e) {
		}
	}

	public void testModify() {
		try {
			mamgerService.modify(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void testQuery() {
		try {
			mamgerService.query(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

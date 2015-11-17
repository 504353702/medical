package junitTest;

import static org.junit.Assert.*;

import javax.annotation.Resource;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import com.demo.dao.UserDaoInter;
import com.demo.service.UserServiceInter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceTest {

	@Resource
	private UserServiceInter userService;
	@Resource
	private UserDaoInter userDao;
	
	
	@Ignore
	@Transactional
	@Rollback(true)
	@Test
	public void testDeleteUser() {
		userService.deleteUserById(1);
	}

	@Transactional
	@Rollback(true)
	@Test
	public void testUpdateUser() {
		userService.updateUserNameByHql(1, "dddd");
	}

	@Ignore
	@Transactional
	@Rollback(true)
	@Test
	public void testUpdateUserNameByHql() {
		fail("Not yet implemented");
	}

}

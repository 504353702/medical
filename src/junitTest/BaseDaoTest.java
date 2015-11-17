package junitTest;

import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.demo.beans.User;
import com.demo.dao.BaseDaoInter;
import com.demo.dao.UserDaoInter;
import com.demo.service.UserServiceInter;

/**
 * @author 付新忠
 * 创建日期：2014年6月26日13:11:29
 * 修改日期：2014年6月26日13:11:34
 * 基础的dao单元测试类
 * 包含基础dao中的增删改出方法
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class BaseDaoTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Resource
	private BaseDaoInter baseDao;
	
	@Resource
	private UserDaoInter userDao;
	
	
	@Resource
	private UserServiceInter userService;
	
	
	@Transactional
	@Rollback(true)
	@Test
	public void testUpdateUserName(){
		System.out.println(userService.updateUserNameByHql(1, "kkkk"));
	}
	
	@Ignore
	@Transactional
	@Rollback(true)
	@Test
	public void testGetTotlePage() {
		String hql="select count(id) from User ";
		
		System.out.println(baseDao.findTotleNum(hql));
	}

	@Ignore
	@Transactional
	@Rollback(true)
	@Test
	public void testFindObjectsByPage() {
		fail("Not yet implemented");
	}

	@Ignore
	@Transactional
	@Rollback(true)
	@Test
	public void testGetTotleNum() {
		fail("Not yet implemented");
	}

	@Ignore
	@Transactional
	@Rollback(true)
	@Test
	public void testFindObjectsByHql() {
		String hql="from User where id="+1;
		User user=(User) baseDao.findObjectsByHql(hql);
		System.out.println(user.getUserName()+"444444444444444");
	}

	@Ignore
	@Transactional
	@Rollback(true)
	@Test
	public void testGetObjectsBySql() {
		fail("Not yet implemented");
	}

	@Ignore
	@Transactional
	@Rollback(true)
	@Test
	public void testGetObjectByHql() {
		fail("Not yet implemented");
	}

	@Ignore
	@Transactional
	@Rollback(true)
	@Test
	public void testGetObjectBySql() {
		fail("Not yet implemented");
	}

	@Ignore
	@Transactional
	@Rollback(true)
	@Test
	public void testUpdateObject() {
		fail("Not yet implemented");
	}

	
	@Transactional
	@Rollback(true)
	@Test
	public void testAddObject() {
		User user=new User();
		
		user.setUserName("333");
		if(null==baseDao){
			System.out.println("hhhhhh");
		}
		userDao.addUser(user);
	}

	@Ignore
	@Transactional
	@Rollback(true)
	@Test
	public void testDeleteObject() {
		fail("Not yet implemented");
	}

}

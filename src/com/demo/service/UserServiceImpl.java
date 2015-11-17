package com.demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;

import com.demo.beans.User;
import com.demo.dao.UserDaoInter;

@Service(value="userService")
public class UserServiceImpl implements UserServiceInter {

	@Resource
	private UserDaoInter userDao;
	private Log logger = LogFactory.getLog(getClass());
	@Override
	public String addUser(User user) {
		
		return null;
	}

	@Override
	public String updateUserNameByHql(int id, String newName) {
		//这里做业务逻辑处理，数据验证
	    logger.debug("用户登录:这是一个日志测试");
		//业务处理完毕
		return userDao.updateUserNameByHql(id, newName);
	}

	@Override
	public String deleteUserById(int id) {
		
		return userDao.deleteUserById(id);
	}
	@Override
	public User queryUserByid(String  id) {
		//这里做业务逻辑处理，数据验证
	    logger.debug("用户登录:这是一个日志测试");
		//业务处理完毕
		return (User) userDao.queryUserById(id);
	}
}

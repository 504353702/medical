package com.demo.dao;

import java.util.List;

import com.demo.beans.User;

/**
 * @author 许雷
 * 创建日期：2014年6月26日13:08:02
 * 修改日期：2014年6月26日13:08:07
 * 用户管理模块dao接口
 * 包含所有用户相关的方法
 *
 */
public interface UserDaoInter {

	/**
	 * @param user
	 * @return 成功 success 失败 fail
	 * 添加用户
	 */
	String addUser(User user);
	/**
	 * @param page
	 * @param rowsPerPage
	 * @return 用户list集合
	 */
	List<User> findUserByPage(int page,int rowsPerPage);
	
	/**
	 * @return 成功 success 失败 fail
	 */
	String updateUserNameByHql(int id,String newName);
	/**
	 * @return 成功 success 失败 fail
	 */
	String deleteUserById(int id);
	/*
	 *  Criteria的测试用法
	 */
	Object queryUserById(String  id);
}

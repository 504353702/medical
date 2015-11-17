package com.demo.service;

import com.demo.beans.User;

/**
 * @author 许雷
 * 创建日期：2014年6月26日13:09:43
 * 修改日期：2014年6月26日13:09:51
 * 说明信息：用户模块服务类接口
 *
 */
public interface UserServiceInter {

	/**
	 * @param user 需要保存的用户对象
	 * @return 操作成功 返回success 失败返回  fail
	 * 说明信息：添加用户的接口方法
	 */
	String addUser(User user);
	/**
	 * @param id
	 * @param newName 新的用户名
	 * @return 操作成功 返回success 失败返回  fail
	 * 更新用户姓名的接口
	 */
	String updateUserNameByHql(int id,String newName);
	/**
	 * @param id
	 * @return 操作成功 返回success 失败返回  fail
	 * 根据id删除用户
	 */
	String deleteUserById(int id);
	User  queryUserByid(String  id);
}

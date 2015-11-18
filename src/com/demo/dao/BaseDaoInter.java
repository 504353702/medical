package com.demo.dao;

import java.util.List;


/**
 * @author 付新忠
 * 创建日期：2014年6月26日13:06:17
 * 修改日期：2014年6月26日13:06:23
 * 通用的dao方法封装在此，其他所有dao必须继承的类的借口
 *@version 1.0
 */
public interface BaseDaoInter {

	/**
	 * @return 总页数
	 * 查询总页数的方法
	 * @param rowsPerPage 每一页的记录行数
	 * @param hql 查询语句
	 */
	public int findTotlePage(int rowsPerPage,String hql);
	/**
	 * @param page 当前页数
	 * @param rowsPerPage 每页记录数
	 * @param hql 查询语句
	 * @return 结果的list集合
	 */
	public List<?> findObjectsByPage(int page,int rowsPerPage,String hql);
	/**
	 * @param hql 查询语句
	 * @return 数据库中总的记录数
	 */
	public int findTotleNum(String hql);
	/**
	 * @param hql 查询语句
	 * @return 结果的list集合
	 */
	public List<?> findObjectsByHql(String hql);
	/**
	 * @param sql 查询语句
	 * @return 结果list
	 */
	public List<?> findObjectsBySql(String sql);
	/**
	 * @param hql 查询语句
	 * @return 单个对象
	 */
	public Object findObjectByHql(String hql);
	/**
	 * @param hql 查询语句
	 * @return 单个对象 
	 */
	public Object findObjectBySql(String sql);
	/**
	 * @param object 需要更新的对象
	 * @return 返回 “success”成功 “error”失败
	 */
	public String updateObject(Object object );
	/**
	 * @param object 需要保存的对象
	 * @return 返回 “success”成功 “error”失败
	 */
	public String addObject(Object object );
	/**
	 * @param object 需要删除的对象
	 * @return 返回 “success”成功 “error”失败
	 */
	public String deleteObject(Object object );
	/**
	 * @param hql 需要执行的hql语句
	 * @return 返回 “success”成功 “error”失败
	 */
	public String updateByHql(String hql);
	/**
	 * @param sql 需要执行的sql语句
	 * @return 返回 “success”成功 “error”失败
	 */
	public String updateBySql(String sql);
	/*
	 * Criteria的测试用法
	 */
	public Object queryByhql2(Integer id);
	
}

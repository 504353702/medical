package com.demo.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.demo.beans.User;

@Repository(value="userDao")
public class UserDaoImpl extends BaseDaoImpl implements UserDaoInter {

	private Log logger = LogFactory.getLog(getClass());
	@Override
	public String addUser(User user) {
		super.addObject(user);
		return null;
	}

	@Override
	public List<User> findUserByPage(int page, int rowsPerPage) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public String updateUserNameByHql(int id,String newName) {
		String hql="update User set name='"+newName+"' where id="+id;
		logger.debug("这是一个测试");
		return super.updateByHql(hql);
	}

	@Override
	public String deleteUserById(int id) {
		Session session=super.getSession();
		Query query=session.createQuery("update User set id=66 where id="+id);
		query.executeUpdate();
		return "success";
	}

	@Override
	public Object queryUserById(String id) {
		Session session = getSession();
        Criteria criteria = session.createCriteria(User.class);//要查询出这样一个实例
		criteria.add(Restrictions.eq("id", id));//实例需要满足的条件restrictions限制的意思
	    List emps = criteria.list();//将满足条件的实力查出来
		if(emps!=null&&!emps.isEmpty()){
			return (User) emps.get(0);
		}
		return null;
	}

}

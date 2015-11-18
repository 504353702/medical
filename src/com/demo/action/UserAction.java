package com.demo.action;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.demo.beans.User;
import com.demo.service.UserServiceInter;
import com.demo.utils.SendMail;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author nivelle
 * 创建日期：2015年6月26日13:03:18
 * 修改日期：2015年6月26日13:03:24
 * 用户管理模块的action，所有与用户相关的方法
 *
 */
@ParentPackage("abstract_struts") 
@Namespace("/login") 
@Results( { @Result(name = "success", location = "/index.jsp"), 
@Result(name = "error", location = "/error.jsp") }) 
@ExceptionMappings( { @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") })
public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 6260993177140833514L;

	/**
	 * service层 用户服务类
	 */
	@Resource
	private UserServiceInter userService;
	@Resource
	private  SendMail sendMail;
	private String  id;//用户id
	private String newName;//新用户名
	
	/**
	 * 测试一下成员变量 public类型的
	 */
	public String test;
	
	public String getId() {
		return id;
	}

	public void setId(String  id) {
		this.id = id;
	}

	public String getNewName() {
		return newName;
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}

	/**
	 * @return 成功返回 success 失败返回 fail
	 * 用户登录方法
	 */
	@Action(value="userLogin",results={@Result(name="success",location="/main.jsp")})
	public String login(){
		return null;
	}
	
	/**
	 * @return 成功返回 success 失败返回 fail
	 * 更新用户名的方法
	
	@Action(value="updateUserName",results={@Result(name
			="success",location="/index.jsp")})
	public String UpdateUserName(){
		String flag=userService.updateUserNameByHql(id, newName);
		System.out.println(flag);
		return "success";
	}
	 */
	@Action(value="sendTest",results={@Result(name
			="success",location="/index.jsp")})
	public String SendTest(){
		//String flag=userService.updateUserNameByHql(id, newName);
		//System.out.println(flag);
		//return "success";
		for(int i=0;i<=100;i++){
		 String flag=sendMail.sendMail("taoyan", "fuxinzhong", "1990747641@qq.com");
		 System.out.println(flag);
		 }
		return "success";
	}
	@Action(value="queryUserById",results={@Result(name
			="success",location="/index.jsp")})
	public String QueryUser(){
		User user=userService.queryUserByid(id);
		System.out.println(user.getUserName()+"==========");
		 if(user!=null){
		return "success";
	      }
		  return "error";
      }
}
package com.demo.action;

import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 许雷
 * 用户登陆的action 
 * 创建日期 2014年6月26日13:02:48
 * 修改日期 2014年6月26日13:02:53
 *
 */
@ParentPackage("struts-default") 
@Namespace("/user") 
@Results( { @Result(name = "success", location = "/index.jsp"), 
  @Result(name = "error", location = "/error.jsp") }) 
@ExceptionMappings( { @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") })
public class LoginAction extends ActionSupport {

	
	private static final long serialVersionUID = 2299917472700595169L;

}

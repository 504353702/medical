package com.demo.interceptor;

import javax.interceptor.Interceptor;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

@Interceptor
public class StrutsInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 8430609013830925045L;

	
	@Override
	public void destroy() {
	}


	@Override
	public void init() {
		
	}


	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("********************进入拦截器*****************");
		System.out.println("调用 的action:"+invocation.getProxy().getAction().getClass().getName());
		System.out.println("调用的方法："+invocation.getProxy().getMethod());
		System.out.println("********************走出拦截器*****************");
		return invocation.invoke();
	}

}

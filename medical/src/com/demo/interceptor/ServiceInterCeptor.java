package com.demo.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author 许雷
 * 2014年7月1日20:53:35
 * service类的切面
 *
 */
@Aspect
public class ServiceInterCeptor {

	 /**
	 * 定义一个切入点
	 */
	@Pointcut("execution(* com.demo.service.*(..))")  
	private void anyMethod(){};
	/**
	 * @param name
	 * 前置通知
	 */
	@Before("anyMethod() && args(name)")  
    public void doAccessCheck(String name){  
        System.out.println(name);  
        System.out.println("前置通知");  
    }  
	 
	/**
	 * 后知通知
	 */
	@AfterReturning("anyMethod()")  
    public void doAfter(){  
        System.out.println("后置通知");  
    }  
      
    /**
     * 最终通知
     */
    @After("anyMethod()")  
    public void after(){  
        System.out.println("最终通知");  
    }  
      
    /**
     * 异常通知
     */
    @AfterThrowing("anyMethod()")  
    public void doAfterThrow(){  
        System.out.println("例外通知");  
    }  
      
    /**
     * @param pjp
     * @return
     * @throws Throwable
     * 进入环绕通知"
     */
    @Around("anyMethod()")  
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable{  
        System.out.println("进入环绕通知");  
        Object object = pjp.proceed();//执行该方法  
        System.out.println("退出方法");  
        return object;  
    }  
	
}

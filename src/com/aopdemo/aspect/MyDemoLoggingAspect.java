package com.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

//	// account dao only
//	@Before("execution(public void com.aopdemo.dao.AccountDAO.addAccount())")
//	public void beforeAddAccountAdvice() {
//		System.out.println("\n====>> Executing @Before advice on addAccount()");
//	}
//	
//	// for any add method
//	@Before("execution(public void add*())")
//	public void f() {
//		System.out.println("\n====>> Executing @Before advice on *add");
//	}
//	
//	// for any add method
//	@Before("execution(public * add*())")
//	public void f2() {
//		System.out.println("\n====>> Executing @Before advice on any return type");
//	}
//	
//	// for any add with specific type
//	@Before("execution(* add*(com.aopdemo.Account, ..))")
//	public void f3() {
//		System.out.println("\n====>> Executing @Before advice on add with specific type and other parameters");
//	}
//	
//	// for any add with specific type
//	@Before("execution(* add*(..))")
//	public void f4() {
//		System.out.println("\n====>> Executing @Before advice on add with any parameters");
//	}
	
	@Pointcut("execution(* com.aopdemo.dao.*.*(..))")
	private void forDAOPackage() {}
	
	// create pointcut for setter methods
	@Pointcut("execution(* com.aopdemo.dao.*.set*(..))")
	private void getter() {}
	
	// create pointcut for setter methods
	@Pointcut("execution(* com.aopdemo.dao.*.get*(..))")
	private void setter() {}
	
	// create pointcut include exclude getter/setter
	@Pointcut("forDAOPackage() && !(getter() || setter())")
	private void forDaoPackageNoGetterSetter() {}
	
	// for any add with specific type
	@Before("forDaoPackageNoGetterSetter()")
	public void f5() {
		System.out.println("\n====>> Executing @Before advice on any class in com.aopdemo.dao with any methods with any parameters");
	}
	@Before("forDaoPackageNoGetterSetter()")
	public void f6() {
		System.out.println("\n====>> Executing @Before advice on any class in com.aopdemo.dao with any methods with any parameters f6");
	}
}

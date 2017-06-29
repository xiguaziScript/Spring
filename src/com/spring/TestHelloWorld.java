package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {

	public TestHelloWorld() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContent.xml");
	 Hello hello=	(Hello) ac.getBean("hello");
	 System.out.println(hello.DoSalutation());
	}

}

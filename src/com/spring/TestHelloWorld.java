package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {

	public TestHelloWorld() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
    ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContent.xml");
	 Hello hello=	(Hello) ac.getBean("hello");
	 System.out.println(hello.DoSalutation());
	}

}

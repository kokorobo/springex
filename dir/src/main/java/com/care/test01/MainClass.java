package com.care.test01;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.care.di_ex02.STBean;

public class MainClass {
	public static void main(String[] args) {
		String config = "classpath:application_test01.xml";
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext(config); 
		PrintBean pb2 = ctx.getBean("pb", PrintBean.class);
//		String name = "홍길동";
//		int age = 20;
//		stBean.setName(name);
//		stBean.setAge(age);
		
//		stBean.setSt(st);
		pb2.print();
	}
}


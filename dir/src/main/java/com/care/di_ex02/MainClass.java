
package com.care.di_ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		STBean stBean = new STBean();
//		Student st = new Student();
		String config = "classpath:applicationST.xml"; // 해당 주소 xml을 어옴 
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext(config); // 파일을 가져올수 있음? 뭔데?
		STBean stBean = ctx.getBean("stb", STBean.class);
//		String name = "홍길동";
//		int age = 20;
//		stBean.setName(name);
//		stBean.setAge(age);
		
//		stBean.setSt(st);
		stBean.print();
	}
}









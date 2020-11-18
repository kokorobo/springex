package com.care.test01;

public class PrintBean {
	private String print;
	private PrintString ps;
	private String age;
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getPrint() {
		return print;
	}
	public void setPrint(String print) {
		this.print = print;
	}
	public PrintString getPs() {
		return ps;
	}
	public void setPs(PrintString ps) {
		this.ps = ps;
	}
	public void print() {
		ps.printString(print,age);
	}
}

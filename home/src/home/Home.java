package home;

import java.util.Scanner;
	



public class Home {
	
	private String name;
	private String studentNumber;
	
	private int html;
	private int css;
	private int js;
	private int java;

	public Home() {
		System.out.println("객체가 생성되었습니다");
		}
		
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	
	public void setStudentNumber(String name) {
		this.studentNumber = name;
	}

	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	
	public int getCss() {
		return css;
	}
	public void setCss(int css) {
		this.css =css;
	}
	public int getJs() {
		return js;
	}
	public void setJs(int js) {
		this.js = js;
	}
	
	public int getJava() {
		return java;
	}
	
	public void setJava(int java) {
		this.java = java;
	}
	
	public int getSum() {
		return html + css + +js + java;
	}
	
	public double getAverage() {
		return getSum() / 4.0;
	}
	
	public String toString() {
		
		String str = String.format(
				"[%s] %s \n HTML : %d / CSS : %d / JS : %d / JAVA : %d\n"
				+ " 합계 : %d\n"
				+ " 평균 : %.2f"		,
				studentNumber,name,html,css,js,java,getSum(),getAverage()); 
	
		return str;
	
	}
	
	
	
}


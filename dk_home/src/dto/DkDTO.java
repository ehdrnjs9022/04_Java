package dto;

public class DkDTO {

	private String studentNumber;
	private String name;
	private char gender;
	
	private int html;
	private int css;
	private int js;
	private int java;
	private int db;
	private int jdbc;
	
	
	public DkDTO() {}
	
	public DkDTO(String studnetNumber,String name,char gender) {
			this.studentNumber = studnetNumber;
			this.name = name;
			this.gender = gender;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudnetNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
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
		this.css = css;
	}

	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	
	public int getJs() {
		return js;
	}
	public void setJs(int js) {
		this.js = js;
	}
	public int getDb() {
		return db;
	}
	public int getJdbc() {
		return jdbc;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public void setJdbc(int jdbc) {
		this.jdbc = jdbc;
	}
	
	
	public String toString() {
		// [학번] 이름(성별)
		// HTML : 100 / ...
		return 
			String.format("[%s] %s(%c) \n"
					+ "HTML : %d / CSS : %d / JS : %d / JAVA : %d / DB : %d / JDBC : %d	",
					studentNumber,name,gender,html,css,js,java,db,jdbc);	
		
	}
	
	
	
	
	
	
}

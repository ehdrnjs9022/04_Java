package dto;

/*DTO(Data Transfer Object) : 값 전달용 객체
 * -> 객체를 이용해서 여러 값을 묶어 전달하는 용도
 */

public class StudentDTO {

	// 필드 
	
	// private 왜? 캡슐화 원칙
	private String studentNumber; // 학번 
	private String name;					// 이름
	private char   gender;        // 성별
	private int 	 html;
	private int 	 css;
	private int 	 js;
	private int 	 java;
	
	
	
	// 매개 변수가 있는 생성자
	public StudentDTO(String studentNumber, String name, char gender) {
		this.studentNumber = studentNumber;
		this.name = name;
		this.gender = gender;
	}

	/* 해당 클래스에는 생성자가 존재하기 때문에
	 * 컴파일러가 "기본 생성자"를 자동으로 추가하지 않는다!!! ->
	 * -> 객체 생성할 때 매개변수가 들어가있는것을 꼭 입력해라(필수) 
	 * -> 기본생성자 없이 매개변수 생성자만 작성*/

	//get 값을보내라
	public String getstudentNumber() {
		return studentNumber;
	}
 //set 값을 설정해라
	public void setStudentNumber(String studentNumber) {
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

	public String getStudentNumber() {
		return studentNumber;
	}

	// alt + shift + s -> r : getter/setter 자동 생성 기능
	
	public String toString() {
		// [학번] 이름(성별)
		// HTML : 100 / CSS : 50 / JS : 70 / Java : 100
		return
				String.format(
						"[%s] %s(%c) \n"
						+"HTML : %d / CSS : %d : / JS :%d / Java : %d", 
						studentNumber, name, gender,
						html, css, js, java);
	}
}

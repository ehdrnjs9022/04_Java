package dto;

public class HomeDTO {

		private String studentNumber;
		private String name;
		private char gender;
		private int html;
		private int css;
		private int js;
		private int java;
		
		public HomeDTO(String studentNumber, String name, char gender) {
			this.studentNumber = studentNumber;
			this.name = name;
			this.gender = gender;
		}
		
		public String getStudnetNumber() {
			return studentNumber;
		}
		public void setStudentNumber(String studentNumber) {
			this.studentNumber=studentNumber;
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
		
		public String toString() {
			return 
					String.format("[%s]  %s(%c) \n "
							+ "HTML : %d / CSS : %d / JS : %d / Java : %d",
							studentNumber,name,gender,html,css,js,java);
		}
		
		
		
}

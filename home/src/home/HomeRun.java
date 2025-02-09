package home;

public class HomeRun {
	public static void main(String[] args) {
		
		Home h1= new Home();
		
		
		h1.setName("나야");
		h1.setStudentNumber("20192222");
		h1.setJs(15);
		h1.setHtml(20);
		h1.setJava(60);
		h1.setCss(62);
		
		//System.out.println(h1.getName() + "의 점수의 합계 : " + h1.getAverage());
										 
			String result = h1.toString();
			System.out.println(result);
	}	
}

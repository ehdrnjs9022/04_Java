package run;

import view.StudentView;
/*Run
 * - 자바 프로그램 실행용 클래스
 */
public class StudentRun {
	
	public static void main(String[] args) {
		
		
		//객체를 1회용으로 사용하는 방법 
		// 생성자
		/* - 객체가 생성될때 수행할 명령어를 작성한 특수한 메서드
		*/
		
		new StudentView().mainMenu(); // ->객체를 만든다 메인메뉴 매서드 실행 ->View로
		
		// 새로운 StudentView 객체가 생성 되자마자
		//mainMenu() 메서드 호출
		
		
		// -> mainMenu()가 종료되면
		// new StudentView() 로 만들어진 객체가 사라짐
		// (왜? 참조하는 변수가 없어서 GC가 없애버림)
	}
}

package view;

import java.util.Scanner;

import service.HomeService;

public class HomeView {
	
	private Scanner sc = new Scanner(System.in);
	
	private HomeService service =  new HomeService();  
	
	
	/**
	 * 학생 관리 프로그램 메인 메뉴
	 */
	public void mainMenu() {
		
		int input = 0;
		
		do {
				System.out.println("*** 학생 관리 프로그램 ***");
				System.out.println("1.학생 추가");
				System.out.println("2.학생 전체조회");
				System.out.println("3.학생 1명 정보 조회(인덱스)");
				System.out.println("4.학생 이름으로 조회");
				System.out.println("5.학생 정보 수정(인덱스)");
				System.out.println("6.학생 1명 점수 조회(점수,합계,평균)");
				System.out.println("7.평균 최고점, 최저점 학생");
				System.out.println("0.종료");
				input = sc.nextInt();
			
			
		} while(input !=0	);
				switch(input) {
				case 1 :  break;
				case 2 : 	break; 
				case 3 :  break;
				case 4 :  break;
				case 5 :  break;
				case 6 :  break;
				case 7 :  break;
				case 0 : default:
				
		
		}
			
		
		
	}
	
	
}

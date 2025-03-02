package view;

import java.util.Scanner;

import dto.DkDTO;
import service.DkService;


public class DkView {

private Scanner sc = new Scanner(System.in);
	
	private	DkService service = new DkService();
	
	
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
				System.out.println();
				System.out.print("메뉴 선택번호 : ");
				
				input = sc.nextInt();
				sc.nextLine();

				switch(input) {
				case 1 :   break;
				case 2 : all(); ;break; 
				case 3 :  break;
				case 4 :  break;
				case 5 :  break;
				case 6 :  break;	
				case 7 :  break;
				case 0 : System.out.println("*** 프로그램을 종료합니다 ***");	break; 
				default:	System.out.println("잘못된 번호를 입력 하셨습니다"); 
		}
				
		} while(input !=0	);
				
	}
	
	
	private void all() {
		System.out.println("\n*** 학생 전체 조회 ***\n");
		
		DkDTO[] students =	service.getStudents();	
			for(DkDTO std : students ) {
				System.out.println(std.toString());
			}
	
	}
	
	
	
	
	
	
	
	
	
	
}

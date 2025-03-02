package service;

import dto.DkDTO;

public class DkService {
	
	
	/*	매개변수있는 생성자를 하나의객체로 담아서 반환 (하나의 객체에 한명밖에못함)
	 * public void allStudent() {
		 	DkDTO dto = new DkDTO("1995","지동권",'남');
	
		 	System.out.println("학번 : " + dto.getStudentNumber());
		 	System.out.println("이름 : " + dto.getName());
		 	System.out.println("성별 : " + dto.getGender());
	 
	 } */
		
			private DkDTO[] students = new DkDTO[3];
			
			public DkService() {
				System.out.println("순서확인");
				students[0] = new DkDTO("1995", "지동구", '남');
				students[1] = new DkDTO("2001", "전시나", '여');
				students[2] = new DkDTO("2003", "겅부빈", '여');
					
			}
			
			public DkDTO[] getStudents() {
				return students;
			}
			
		



}

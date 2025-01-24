package run;

import service.ArrayService1;
import service.ArrayService2;

public class ArrayRun {
	
	// 실행용 메서드
	public static void main(String[] args) {
		
		
		// ArrayService 객체 생성 // new라는 의미 -> heap 영역에 넣는다
		ArrayService1 service1 = new ArrayService1();
	
		//service1.method1();
		//service1.method2();
		//service1.method3();
		//service1.method4();
		//service1.method5();
	
	
		// ArrayService 객체 생성
		ArrayService2 service2 = new ArrayService2();
		//service2.method1();
		service2.method2();
		//service2.method3();
		
		
		
	
	}
}

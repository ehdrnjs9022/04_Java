package section01;

/* 상속 : 
 * 부모의 코드(필드/메서드)를 물려 받아
 * 자식이 자신의 것 처럼 사용
 * 
 * 특징/장점 :
 * 1. 재사용성 증가
 * (한 번 작성한 부모 코드를 자식들이 재사용)
 * 
 * 2. 유지 보수성 증가
 * (부모 코드만 수정하면 자식은 그대로 있어됨)
 * 
 * 3. 공통적인 규약 정의
 * (물려 받은 자식들의 형태가 부모와 비슷함)
 * -> 부모 코드 수정, 추가, 제거 시 
 *    자식도 일괄 변경
 * 
 * 상속 키워드 : extends(확장하다)
 *  -> 부모의 코드를 물려 받아 자식의 크기가 커지기 때문에!
 *  
 *  *** 주의 사항 ***
 *  1) 부모의 코드 중 생성자는 상속 불가
 *  
 *  2) 부모의 private 필드/메서드도 상속은 되지만
 *   자식이 직접 접근할 순 없다!!
 *   (간접 접근 필요)
 *   -> 왜? 상속 관계여도 다른 객체로 인식되기 때문 
 *   
 *   [상속 메모리 구조]
 *   - 자식 객체 생성시
 *    부모 객체가 같이 생성되어
 *    자식 객체 내부에 배치됨
 *
 *	[super() 생성자]
 *	- 자식 클래스에서 상위(부모) 클래스 생성자를 호출하는 구문   
 *   
 */

public class Child1 extends Parent {
	
	//물려 받은 필드가 존재하기 떄문에 삭제
	//private String lastName  = "김";  // 성
	//private String firstName = "산"; // 이름
	//private String address    = "서울시 강남구";
	//private int money = 5000;

	//Child1만의 필드
	private String laptop;
	
	public Child1() {
		System.out.println("*** Child1 객체 생성됨 ***");
    //	*** Parent 객체 생성됨 ***
    //	*** Child1 객체 생성됨 ***
		// -> 자식 객체 생성 시 부모 객체도 같이 생성된다!!!
		
		setFirstName("산");
		setAddress("서울시 강남구");
		setMoney(5000);
		laptop = "맥북 m4 pro";
	}

	public String getLaptop() {
		return laptop;
	}

	public void setLaptop(String laptop) {
		this.laptop = laptop;
	}
	
}

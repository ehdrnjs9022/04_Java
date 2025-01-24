package encapsulation;

public class EncapsulationRun {

	public static void main(String[] args) {
		
		// Person 객체 생성
		
		Person Person1 = new Person();
		//Person1.name = "홍길동";
		//Person1.height = 180.5;
		Person1.personName("홍길동");
		Person1.setHeight(180.5);
		
		Person Person2 = new Person();
		//Person2.name   = "김미영";
		//Person2.height = - 160.7; 
		
		Person2.personName("김미영");
		Person2.setHeight(-160.7);
		
		// 캡슐화 안했을 때 문제점 (1)
		// -> 잘못된 데이터가 대입될 수 있다
		
		System.out.println("Person1의 이름 :" + Person1.getInfo());
		System.out.println("Person2의 이름 :" + Person2.getInfo());
		
	}
}
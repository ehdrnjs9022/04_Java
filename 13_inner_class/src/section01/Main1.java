package section01;

public class Main1 {
	public static void main(String[] args) {
		
		// 외부 클래스의 인스턴스(클래스에 소속된 객체) 생성
		OuterClass1 outer = new OuterClass1();
		
		// 외부 클래스내에 존재하는 내부 클래스 인스턴스(클래스에 소속된 객체) 생성
		// Outer. < 점은 (Outer) 내부 기능이 머있는지 뜻함
		OuterClass1.InstanceInnerClass inner 
			= outer.new InstanceInnerClass();
		
			inner.display();
			
			System.out.println("----------------------------------------");
		
			// 외부 클래스의 메서드 호출
			// -> 메서드가 내부 클래스 객체 생성
			outer.displayMessage();
	}
}

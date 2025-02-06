package section02.dto;

// 추상 클래스인 Annumal 상속
// -> 부모인 Animal의 필드/메서드(정상/추상)를 물려 받음
// -> 상속 받ㅇ느 추상 메서드를 사용하고 싶으면 재정의(오버라이딩) 하라고 강제


public class Cat extends Animal{
	
	// 필드
	private String fur; // 털
	
	//생성자
	public Cat() {
		super();
	}
	
	public Cat(String type, String fur) {
		super(type);
		this.fur = fur;
	}

	public String getFur() {
		return fur;
	}

	public void setFur(String fur) {
		this.fur = fur;
	}

	@Override
	public String toString() {
		return super.toString() + " / fur : " + fur;
	}
	
	
	@Override
	public void move() {
		System.out.println("고양이 : 4족보행, 사뿐사뿐 움직임");
	}
	@Override
	public void sleep() {
		System.out.println("고양이 : 엎드려서 잠");
	}
	@Override
	public void eat() {
		System.out.println("고양이 : 꺠작꺠작 먹음");
	}
 
	
}

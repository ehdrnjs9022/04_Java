- 자동 형변환
작은값 -> 큰값 int -> double
- 강제 형변환
큰값 -> 작은값 double -> int
int a =10
double  b=1.2

int result=a+b;  11.2

int a1 = 100
double b2 = 12.5

int result=(Int)a+b; 125

- 함수(메서드) = 정의하고 호출

클래스 안에 있으면 메서드
클래스 밖에 있으면 함수

static 이 안붙은 애들이 클래스 안에있으면
객체(Instance)를 따로 생성해야함

접근제어자 static 반환자료형 메서드명](동작에 필요한 값을 전달받는 변수 )] {}

public static int 변수명 반환값있어 = retun
public static void 변수명 = 시스템으로 반환

1.임의 클래스를 만들고 값을작성	
2.메인메서드에 임의 클래스에 관한 객체를 만들어
3.만든 객체에 클래스에 주었던 값을 작성해
4.메인메서드에 있는 객체에 값을 작성하고 
5. 함수하나를 만들어 매개변수에 값을주고 거기서 sys 호출해!끝

객체= 인스턴스인데
특정(어떤)클래스에 있는객체를 표현하고싶을떄는 인스턴스라고부른다

function 함수명(){} -> 함수
{"testFn" : function(){}}  -> 객체가 가지고 있는 함수 중괄호 안에

생성자 - 생성할떄 호출되는게 목적

Student s1 = new Student();
s1.x =100;
s1.y =200;
s1 참조변수가 메모리 heap 에 만들어진 x,y변수를 가지는 객체를 참조함
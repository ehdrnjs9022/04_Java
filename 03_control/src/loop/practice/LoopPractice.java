package loop.practice;

import java.util.Scanner;

/**
 * 기능 제공용 클래스
 */

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	
	 public void practice1(){
		 
		 
		 System.out.println("숫자 입력 :");
		 int num = sc.nextInt();
		 
		 if(num<1) {
			 System.out.println("1 이상의 숫자를 입력해주세요.");
			 return;
		 }
		 for(int i=1; i<=num ;i++) {
				 System.out.print(i + " ");
		 } 
	 }
	//--------------------------------------------------------
	 public void practice2() {
		 System.out.println("숫자 입력 :");
		 int num = sc.nextInt();
		 if (num<1) {
			 System.out.println("1 이상의 숫자를 입력해주세요.");
			 return;
		 } 
		 for(int i=num; i>=1; i--) {
			 System.out.print(i+" ");
		 } 
		 
	 }
	//--------------------------------------------------------
	 public void practice3() {
		 System.out.print("숫자 입력 :");
		 int num = sc.nextInt();
		 int sum = 0;
		 
		 for(int i=1; i<=num; i++) {
			 sum += i;
						 
			 System.out.print(i + " + ");
		 }

		 System.out.print (" = " +sum);
	 }
	 //-------------------------------------------------------
	 public void practice4(){
		 System.out.print("첫 번째 숫자 :");
		 int num1 = sc.nextInt();
		 
		 System.out.print("두 번째 숫자 :");
		 int num2 = sc.nextInt();
		 
		 if(num1<1 && num2<1) {
			 System.out.println("1 이상의 숫자를 입력해주세요");
			 return;
		 }
		 if(num1 >= num2) {
			 for(int i=num2; i<=num1; i++) {
				 System.out.println(i + " ");
				 
			 }
		 }
		 	else {
			 for(int i=num1; i<=num2; i++) {
				 System.out.println(i + " ");
				 
			 }
		 }
	}
	//-------------------------------------------------------- 
	 public void practice5(){
		 
		 System.out.println("단 입력 :");
		 int dan = sc.nextInt();
		 
		 for(int i=1; i<=9; i++) {
			 System.out.printf("%d x %d =%d\n",dan,i,dan*i);
		 }
	 }
	//-------------------------------------------------------- 
	 public void practice6(){
		 
		 System.out.println("단 시작 :");
		 int dan1 = sc.nextInt();
		 
		 System.out.println("단 마지막 :");
		 int dan2 = sc.nextInt();
		 
		 
		 for(int dan=dan1; dan <=dan2; dan++) {
			 System.out.printf("\n%d단\n",dan);
			 
			 for(int i=1; i<=9; i++) {
				 System.out.printf("%d x %d=%d\n",dan,i,dan*i);
			 }
		 }
	 }
	 //---------------------------------------------------------
	 public void practice7(){
		 System.out.print("정수 입력 :");
		 int num = sc.nextInt();
		 
		 for(int i=1; i<=num; i++){
			 for(int j=1; j<=i; j++) {
				 System.out.print("*");
			 }
			System.out.println();
			}
		 }
		 
	 //---------------------------------------------------------
	 public void practice8(){
		 System.out.print("정수 입력 :");
		 int num = sc.nextInt();
		 
		 for(int i=1; i<=num; i++) {
			 for(int j=num; j>=i; j--)
			 System.out.print("*");
			 System.out.println();
		 }
		
	 }
		 
		 
		 
	 public void practice11() {
		 System.out.print("정수 입력 :");
		 int num = sc.nextInt();
		 
		 for(int row=1; row<=num; row++) {
			 // 앞쪽 공백 추가 방법 1
			 
			 for(int blank=1; blank<=num-row; blank++){
				 System.out.println(" ");
				 
				 for(int col=1; col<=row; col++) {
					 System.err.println("*");
				
				 }
			 }
			 System.err.println(); // 줄바꿈
		 }
		 			
	 }
		 
	 public void practice12() {
		 System.out.print("정수 입력 :");
		 int num = sc.nextInt();
		 
		 for(int row=1; row<=num; row++) {
			 for(int col=1; col<=num; col++) {
				 if(row ==1 || row == num || col ==1 || col == num) {
					 System.out.println("*");
				 } else {
					 System.out.println(" ");
				 }
				 
				 
				 }
			 System.out.println(); //줄바꿈
			 }
			 		 
	 }
	 public void practice16() {
		 System.out.print("정수 입력 :");
		 int num = sc.nextInt();
		 
		 int count =0; // 소수 개수를 세기 위한 변수
		 
		 // 2부터 입력 받은 수 까지 1개씩 접근하는 for문
		 for(int i=2; i<=num; i++) {
			 
			 boolean flag = true; // 깃발(신호 용도)
			 // true인 경우  : 소수 O
			 // flase인 경우 : 소수 X
			 
			 // 1과 자기자신(num)을 뺀 정수를 한 개씩 접근(x)
			 for(int x=2; x<i; x++) {
				 
				 
				 if(i % x == 0) { // 5라고했을때 1, 자기자신(5) 뺴고 나누어 떨어지는 수 존재
					 flag = false;
					 break;
				 }
				 
				 if(flag) { // 소수라고 판별된 경우 수행
					 System.out.print(i +" ");
					 count++;
				 }
				 
				 
			 }
		 
		 }
		 System.out.printf("2부터 %d까지 소수의 개수는 %d 입니다\n", num,count);
		 
		 
		 
	 }
	 
	 


}

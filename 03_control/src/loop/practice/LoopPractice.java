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
		 int sum = num;
		 
		 
		 for(int i=1; i<=num-1; i++) {
			 sum += i;
			 System.out.print(i);
			 
			 System.out.print(" + ");
		 }

		 System.out.print(num + " = ");
		 System.out.print(sum);
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
		 
		 for(int i=1; i<=num-3 ;i++) {
		 	System.out.println(i);
		 	for(int j=2; j<=num-2 ;j++) {
		 		System.out.println(j);
		 		for(int k=3; k<=num-1 ;k++) {
		 			System.out.println(k);
		 			for(int n=4; n<=num ;n++) {
		 				System.out.println(n);
		 			}
		 		}
		 	}
		 	
			 
				 
			 }
			 
		 }
		 
		 
		 
	 
	 
	 
	 
	 
	 
	 




}

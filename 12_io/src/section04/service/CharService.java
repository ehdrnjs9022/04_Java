package section04.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharService {
	
	/* [문자 기반 스트림]
	 * 
	 * - 2byte(char) 단위로 입/출력하는 스트림
	 * 
	 * - 문자만 작성된 파일(txt, bin 등),
	 * 	채팅, JSON, 웹 요청(주소)/응답(HTML)
	 * 
	 * - 문자 기반 스트림 최상위 인터페이스 : 
	 *  [프로그램 기준]Reader(입력), Writer(출력) 
	 */

	/** 문자 기반 스트림을 이용한 파일 출력
	 *
	 */
	
	public void fileOutput1() {
		
		FileWriter fw = null;
		
		try {
			String content = """
어젯밤 꿈에 나타난 너는
하늘 위를 날고 있었어
닿을 수 없는 거리를 둔 채
그저 바라보다 깼어
기억나니 그땐 무서울 게 없이
하고 싶은 게 생겼을 땐
바로 움직이던 날들이 많았지
우리 그땐 참 재밌었지
너와 보낸 그날들이 다
이젠 떠난
널 떠올리며 아파하기 보다
함께했었던 그날들을 다
추억하며 웃어 보려 해
단지 이거
하나만은 약속해 줬으면 해
더는 아프지 말고 웃으며
행복하게 지내 구름 위에서
""";
			// 폴더가 없을 경우 생성
			String path = "io_test_char";
			File folder = new File(path);
			if(!folder.exists()) folder.mkdirs();
			
			// 문자 기반 파일 출력 스트림 객체 생성
			fw = new FileWriter(folder + "/" + "구름위에서.txt");
			
			// 문자 기반 스트림을 이용해서 출력하기
			fw.write(content); // String, char[] 출력을 위한 기능이 제공됨	
			
			 // 스트림에 남은 데이터를 밀어냄
			fw.flush(); // close() 시 자동 수행됨(close() 있으면 굳이 안써도 되긴함)
			
			System.out.println("출력 완료");
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fw !=null)	fw.close();
			} catch (IOException e) {
				e.printStackTrace();
				}
		}
	}
	/** 문자 기반 스트림 + 보조 스트림을 이용한 파일 출력
	 */
	
	public void fileOutput2() {
		
		FileWriter fw = null;
		BufferedWriter bw =null; // 버퍼를 이용한 보조 스트림
		
		try {
			String content = """
어젯밤 꿈에 나타난 너는
하늘 위를 날고 있었어
닿을 수 없는 거리를 둔 채
그저 바라보다 깼어
기억나니 그땐 무서울 게 없이
하고 싶은 게 생겼을 땐
바로 움직이던 날들이 많았지
우리 그땐 참 재밌었지
너와 보낸 그날들이 다
이젠 떠난
널 떠올리며 아파하기 보다
함께했었던 그날들을 다
추억하며 웃어 보려 해
단지 이거
하나만은 약속해 줬으면 해
더는 아프지 말고 웃으며
행복하게 지내 구름 위에서
""";
			// 폴더가 없을 경우 생성
			String path = "io_test_char";
			File folder = new File(path);
			if(!folder.exists()) folder.mkdirs();
			
			// 문자 기반 파일 출력 스트림 객체 생성
			fw = new FileWriter(folder + "/" + "구름위에서_buffer.txt");
			
			// 보조 스트림 객체 생성
			bw = new BufferedWriter(fw);
			
			// 문자 기반 스트림을 이용해서 출력하기
			bw.write(content); // String, char[] 출력을 위한 기능이 제공됨	
			
			 // 스트림에 남은 데이터를 밀어냄
			bw.flush(); // close() 시 자동 수행됨(close() 있으면 굳이 안써도 되긴함)
			
			System.out.println("출력 완료");
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bw !=null)	bw.close();
			} catch (IOException e) {
				e.printStackTrace();
				}
		}
	}
	
	/**
	 * 문자 기반 입력 스트림 + 보조 스트림 이용해 파일 읽어오기 (새로운 방법)
	 */
	public void fileInput() {
		
		/* [try - with - resource]
		 * - 자바 7버전(2011년)에서 추가된 기능
		 * - finally에서 작성하던 close 처리 구문을
		 *   자동으로 수행하도록 만드는 구문
		 *   try 괄호가 닫히면 자동으로 br 객체가 close
		 */
		String path = "io_test_char/구름위에서.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			//1)FileReader(path)기반스트림 안에파일을 여는 역할 -> 혼자쓰면 느림
			//2)BufferedReader보조스트림으로 감싸 효율을 높임
			// 보조 스트림을 이용해서 파일 내용 읽어오기
			
			StringBuilder sb =new StringBuilder(); // 읽어온 내용 누족
			String temp = null; // 임시 변수 
			
			while(true) {
				temp = 	br.readLine(); // 한 줄씩 읽어오기
			
				if(temp == null) break; // 읽어온 내용이 없으면 반복 종료
				
				sb.append(temp); // 읽어온 내용 누적(엔터 미포함)
				sb.append("\n"); // 엔터 추가
			}
			
			System.out.println("읽어오기 성공!");
			System.out.println("-------------------------------------------");
			System.out.println(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}  
		// finally에서 close 하던 구문 생략 가능
	}
	
	// Scanner 대신 스트림을 이용한 문자열 입력 받기
	// -> Scanner가  편리하긴 한데 매우 느림!!
	
	// 키보드 입력 -> 바이트(2진수) 코드 문자 입력 -> 문자 변환
	
	public void keyboardInput() {
		
		// System.in : 기본 장치(키보드)와 연결된 InputStream 반환
		// InputStreamReader : 바이트 스트림 -> 문자 스트림 변환
		// 문자기반(BufferedReader)
		
		try(BufferedReader br = new BufferedReader( new InputStreamReader(System.in) )) {
																									
		System.out.print("문자열 입력1 : ");
		String input1 = br.readLine(); // 입력된 한 줄 읽어오기
		System.out.print("문자열 입력2 : ");
		String input2 = br.readLine(); // 입력된 한 줄 읽어오기
		
		System.out.println("input1 : " + input1);
		System.out.println("input2 : " + input2);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

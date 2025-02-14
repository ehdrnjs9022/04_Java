package section01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application02 {
	public static void main(String[] args) {
		
		
		/* 스트림 생성 방법 */
		
		// 1) 배열 -> 스트림
		String[] names = {"짱구", "후니", "맹구", };
		Stream<String> nameString = Arrays.stream(names); // 스트림객체생성
		
		
		// 스트림 + 메서드 참조
		nameString.forEach(System.out::println);
		
		//  java.lang.IllegalStateException: 
		//stream has already been operated upon or closed
		// -> 스트림이 이미 작동되었거나 종료되었습니다
		// -> 스트림은 일회용!
		// nameString.forEach(System.out::println); // 오류발생
		
		// 2) 컬렉션 -> Stream
//		List<String> animals = new ArrayList<String>(); (배열)
//		animals.add("dog");
//		animals.add("cat");
//		animals.add("cow");
//		animals.add("rat");
//		animals.add("pig");
		
			List<String> animals 
				= Arrays.asList("dog","cat","cow","rat","pig");
			// 고정된 길이의 List 생성 및 요소 추가(List로 바꾼다)
		
			Stream<String> animalStream = animals.stream();
			
			animalStream.filter(animal -> animal.startsWith("c")) // c로 시작하는것만 출력
									.forEach(System.out::println);
			
			
			// 3) Stream 객체 생성
			
			IntStream intStream1  = IntStream.range(3, 7); // 3이상 7미만
			IntStream intStream2 = IntStream.rangeClosed(3, 7); // 3이상 7이하
			
			System.out.println();
			intStream1.forEach(System.out::print);
			System.out.println();
			intStream2.forEach(System.out::print);
			
			LongStream longStream = LongStream.rangeClosed(1,9); //1이상 9이하
			System.out.println();
			longStream.forEach(num -> System.out.print(num + " "));
			
			DoubleStream doubleStream = DoubleStream.of(3.14,4.5,11,7);
			System.out.println();
			//double sum = 0; 람다 표현식 내에서 사용되는 지역변수는 
			//final이거나 effectively final이어야 함
			
			// 3.14가 0으로 들어가서 a 주고 
			double sum = doubleStream.reduce(0,(a,b) -> a + b);
			System.out.println("합계 : " +sum);
		
			Stream<String> fruitStream = Stream.of("사과","딸기","바나나");
			fruitStream.forEach(System.out::println);
			
	}
}

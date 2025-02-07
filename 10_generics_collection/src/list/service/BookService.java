package list.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import list.dto.BookDTO;

/**
 * 도서 관리 프로그램 기능 제공 클래스
 */
public class BookService {
	
	private List<BookDTO> bookList = new ArrayList<BookDTO>(); //필드값
	
	// 기본 생성자
	public BookService() { // 기본생성자가 호출이된다면 필드에있는것들이 bookList에 생성
		// 샘플 데이터 추가
		bookList.add(new BookDTO("소년이 온다", "한강", 15000, "창비"));
		bookList.add(new BookDTO("초역 부처의 말", " 코이케 류노스케", 17800, "포레스트북스"));
		bookList.add(new BookDTO("채식주의자", "한강", 15000, "창비"));
		bookList.add(new BookDTO("작별하지 않는다", "한강", 16800, "문학동네"));
		bookList.add(new BookDTO("모순", "양귀자", 13000, "쓰다"));
	}
	
	//접근제어자 ,반환명(주소저장)
	public List<BookDTO> getBookList() {
		return bookList;
	}
	
	/** 전달 받은 index 번째 bookList 요소 반환
	 * 단, 범위 초과 시 null 반환
	 * @param index
	 * @return BookDTO 참조 주소 또는 null
	 */
	public BookDTO selectIndex(int index) {
		
		// 범위 초과 검사 -> 초과 시 
		if(checkIndex(index) == false) return null;
		return bookList.get(index);
	}
	
	/** 
	 * 전달 받은 index가 정상 범위인지 확인
	 * @param index
	 * @return 정상이면 true, 아니면 false
	 */
	public boolean checkIndex(int index) { // 따로만든것
		
		if(index < 0 || index >= bookList.size()) {
			
			return false; // 범위 초과 시 false
		}
		return true; // 정상 범위 true
	}
	
	
	/**
	 * 전달 받은 book을 bookList에 추가
	 * 단, 책 정보가 모두 일치하는 책이 있다면 추가 X
	 * @param book
	 * @return 추가 o = true, 추가 x : false
	 */
	public boolean addBook(BookDTO book) { // book -> 입력받은 book값
		
		// 책 정보 비교 방법 1) 필드 값 하나씩 꺼내서 비교
		// 책 정보 비교 방법 2) equals() 오버라이딩 후 이용
		
		// 북리스트에서 북DTO를 하나씩 꺼내
//		for(BookDTO b : bookList) {
//			if(b.equals(book)) return false;
//		}
		
		// 자바에서 Object가 모든 equals를 제공중
		// BookDTO의 equals()를 오버라이딩 했기 때문에
		// List가 제공하는 contains() (포함하는지 확인) 사용 가능
		if(bookList.contains(book)) return false; 
		
		
		return bookList.add(book); 
		// 컬렉션은 크기 제한이 없어서 무조건 추가 성공! (true 반환)
		
	}

//	public boolean checkModify(int index) {
//		
//		if(index < 0 || index >= bookList.size()) {
//			return false;
//		}
//			return true;
//	}
//
//	public BookDTO modifyBookPrice(int index) {
//		
//		if(checkIndex(index) == false) return null;
//		return bookList.get(index);
//	}

	
	//방법2) Service
	
	/** 전달 받은 index번째 요소의 가겨을 newPrice로 수정
	 * @param index
	 * @param newPrice
	 * @return "[책제목] 가격이 [이전가격] -> [수정된 가격]으로 수정되었습니다"
	 */
	public String modifyBookPrice2222222(int index, int newPrice) {
		// selectIndex(index)
			BookDTO target = bookList.get(index); // 인덱스번째 요소 얻어오기
			int oldPrice = target.getPrice(); // 이전가격 저장
			target.setPrice(newPrice); // 새가격으로 수정
			
			return String.format(
					"[%s] 가격이 [%d] -> [%d]으로 수정되었습니다",
					target.getTitle(), oldPrice, newPrice);
	}
	
	/** index번째 BookDTO 제거
	 * 단, 없으면 null 반환
	 * 제거 성공하면 제거된 BookDTO 반환
	 * @param index
	 */
	
	
	public BookDTO removeBook(int index) { // View에서 인덱스를 받아올거니깐 int index매개변수지정
		
		if(checkIndex(index) == false) return null;
		
		return bookList.remove(index);
		// bookList에서 index번째 요소를 제거
		// == index 번째 요소를 뽑아냄
		
		
	}

	/** 제목이 일치하는 책 반환
	 * 
	 * @param title : 찾으려는 책 제목
	 */
					//void자리
	public BookDTO selectTitle(String title) {
			for(BookDTO book1 : bookList) { // bookList에서 하나씩 꺼냄
			
				// 꺼낸 책의 제목과 전달 받은 제목이 같을경우
				if(book1.getTitle().equals(title)) { 
					return book1;
				}
			}
			return null; // 책을 못찾은 경우
	
	}
	
	
	/** 제목이 일치하는 책 제거
	 * 
	 * @param title
	 * @return 
 		*/
	public boolean removeTitle(String title) {
		
		for(BookDTO book : bookList) { // bookList에서 하나씩 꺼냄
			if(book.getTitle().equals(title)) // 꺼낸 책의 제목과 전달받은 책의 제목이 같을경우
				return bookList.remove(book);
			// -> bookList에 저장된 객체(BookDTO)가
			//    equals() 오버라이딩이 되어 있어야 사용 가능
		}
			return false;
	}

		//나
//		public List<BookDTO> publisher(String publisher) {
//		
//		List<BookDTO> list = new ArrayList<BookDTO>();
//		
//		for(BookDTO book : bookList) {
//			if(book.getPublisher().equals(publisher)){
//				list.add(book);
//			}
//		}
//			if(list.isEmpty()) {
//				return null;
//			}
//				return list;
//	}
	
		// 강사님
		
	/**
	 * 입력 받은 publisher와 같은 출판사를 가지는 책을 모두 조회
	 * @param publisher
	 */
	
	// BookDTO -> 책하나 / BookDTO[] or List<BookDTO>
	
	public List<BookDTO> selectPublisherAll(String publisher) {
		
		// 출판사명이 일치하는 책만 저장해둘 List 생성
		List<BookDTO> searchList = new ArrayList<BookDTO>();
		
		// 같은 출판사인 책 찾기
		for(BookDTO book : bookList) {
			if(book.getPublisher().equals(publisher)) { // 출판사 일치하면
				searchList.add(book); // searchList에 찾은 책 추가
			}
		}
		return searchList; // List에 저장된 요소의 개수 : 0개 ~n개
	}
	
/**
 *  입력 받은 author와 같은 출판사를 가지는 책 모두 조회
 * @param author
 * @return
 */
	public List<BookDTO> selectAuthorAll(String author) {
		
		// 저자명이 일치하는 책만 저장해둘 List 생성
		List<BookDTO> searchList = new ArrayList<BookDTO>();
		
		// 같은 저자인 책 찾기
		for(BookDTO book : bookList) {
			if(book.getAuthor().equals(author)) { // 저자 일치하면
				searchList.add(book); // searchList에 찾은 책 추가
			}
		}
		return searchList; // List에 저장된 요소의 개수 : 0개 ~n개
	}
	
	
	/**
	 * 책의 제목, 저자에 검색어가 포함되어 있는 모든 책 조회 
	 * @param keyword : 검색어
	 * @return 0개 ~ n개의 결과를 가지는 List
	 */
	public List<BookDTO> searchBook(String keyword){
		
		List<BookDTO> searchList = new ArrayList<BookDTO>();
		
		// 찾기 시작
		for(BookDTO book : bookList) {
			// book의 제목이 저자에 keyword가 포함된 경우
			if(book.getTitle().contains(keyword) || book.getAuthor().contains(keyword)) {
				searchList.add(book);
				
			} 
		}
		
		return searchList;
	}
	
	/**
	 *  제목 오름차순 정렬
	 */
	public void bookListSorting() {
		
		Collections.sort(bookList);
		// 원본 리스트가 정렬된 형태로 변경
		
	}
	
	
	
	
	


}


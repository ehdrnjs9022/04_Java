package list.dto;

import java.util.Objects;

public class BookDTO implements Comparable<BookDTO>{
	
	private String title;  // 제목
	private String author; // 저자
	private int Price;     // 가격
	private String publisher; // 출판사
	
	public  BookDTO() {} // 기본 생성자

	public BookDTO(String title, String author, int price, String publisher) {
		super();
		this.title = title;
		this.author = author;
		Price = price;
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "BookDTO [title=" + title + ", author=" + author + ", Price=" + Price + ", publisher=" + publisher + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Price, author, publisher, title);
	}
	
	// equals(), hashCode() 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookDTO other = (BookDTO) obj;
		return Price == other.Price && Objects.equals(author, other.author) && Objects.equals(publisher, other.publisher)
				&& Objects.equals(title, other.title);
	}

	// 기본 정렬 기준을 설정(제목 오름차순)
	// -> Collections.sort() 호출 시 자동으로 이 메서드를 이용함
	@Override
	public int compareTo(BookDTO other) {
		return this.title.compareTo(other.title);
		
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

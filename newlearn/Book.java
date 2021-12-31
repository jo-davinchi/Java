package alonepractice;

public class Book {
	//FIELD	
	String title;

	
	//constructor
	public Book() {}
	
	public Book(String title) {
		super();
		this.title = title;
	}
	
	
	//getter setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	//member method
	public void showBookinfo() {
		System.out.println(title);
	}
	
	
		
}

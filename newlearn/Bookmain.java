package alonepractice;

public class Bookmain {

	public static void main(String[] args) {

		Book[] books = new Book[3];
		
		books[0] = new Book("earth1");
		books[1] = new Book("earth2");
		books[2] = new Book("earth3");
		
		for (int i=0; i <books.length; i++) {
			System.out.println(books[i]);
			books[i].showBookinfo();
		}
		
		
		
	}

}

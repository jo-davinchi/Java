package alonepractice;

import java.util.ArrayList;

public class Booktest {

	public static void main(String[] args) {
		//객체배열의 업그레이드 버전이 arraylist이다.
		ArrayList<Book> books = new ArrayList<Book>();
		
		books.add(new Book("earth1"));//books[0]= new Book("earth1:");과 동일
		books.add(new Book("earth2"));
		books.add(new Book("earth3"));
		
		for (int i =0; i<books.size(); i++) {
			books.get(i).showBookinfo();
		}
		
		/*비교연산자를 조건문안에서 활용
		 * 비교할 때 객체가 널이면 객체가 없다는 것이다.
		 * 문자열을 비교를 할때 =으로 비교를 할 수 없고 equals로 비교를 한다. 
		 * 프로젝트는 1월 4일(화욜)즘 뿌려준다.
		 * 
		 * */
	}

}

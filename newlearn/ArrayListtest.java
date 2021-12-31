package alonepractice;

import java.util.ArrayList;

public class ArrayListtest {

	public static void main(String[] args) {
		//arraylist 사용 - 추가,수정,삭제,조회
		//arraylist 객체 생성 <제너릭 사용>
		
		ArrayList<String> s = new ArrayList<String>();
		
		//추가-add()
		s.add("woojin");
		s.add("eric");
		s.add("soso");
		System.out.println(s.get(0));//woojin
		System.out.println(s.get(1));
		System.out.println(s.get(2));
		System.out.println("--------------");
		
		//수정-set(인덱스, 수정할 값)
		s.set(1, "lisa");
		System.out.println(s.get(1));
		
		//삭제 -remove()
		System.out.println("--------------");
		s.remove(1);
		System.out.println(s.get(0));
		System.out.println(s.get(1));//원래 eric인데 그게 삭제가 되면서 한칸씩 댕겨진것
		System.out.println("---------------");
		
		
		//조회
		for (String p: s) {
			System.out.println(p);
		}
		System.out.println("-------------");
		
		//s.size는 배열의 length와 동일한 의미다.
		for(int i=0; i<s.size(); i++) {
			System.out.println(s.get(i));
		}
		
		//삭제 - removeaAll(인스턴스 명) 한꺼번에
		System.out.println("---------");
		s.removeAll(s);
		System.out.println(s.size());
		
		for (String p2 : s) {
			System.out.println(p2);
			System.out.println("nothing");
		}
		
	}

}

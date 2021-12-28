package alonepractice;

public class Three69 {

	public static void main(String[] args) {				
				int i =1;
				//문자열로 만들어서 해야함 3이 들어가있을 경우 
				
				for (; i<=99; i++) {
					String num = Integer.toString(i);//int를 문자열로 바꿔주었습니다.
					
					System.out.print(num+" ");
					
					if (num.length()==2) {// 숫자가 2자리가 되었을 경우에 십의 자리 숫자를 인식하는 조건문입니다.
						if(num.charAt(1)=='3' || num.charAt(1)=='6' || num.charAt(1)=='9') {
							System.out.print("짝");
						}
					}
						
					if(num.charAt(0)=='3' || num.charAt(0)=='6' || num.charAt(0)=='9') {// 숫자가 한자리일 경우에 3,6,9를 인식하는 조건문입니다.
						System.out.print("짝");
					}
					
					if (i%10==0) System.out.println();//10칸씩 나누는 조건문입니다.
					
				}
			}
				
	}



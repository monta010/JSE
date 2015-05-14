package cmm03.flow;

import java.util.Scanner;

public class No07_ManorWoman {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("입력하세요  : ");
		String ssn = scanner.next();
		
		char ch  = ssn.charAt(7);
		
		if(ch == '1' ||  ch =='3'){
			
			System.out.println(" 남자 ");
			
		}else if(ch == '2' || ch == '4'){
			
			System.out.println(" 여자 ");
			
		}else{
			
			System.out.println(" 다시 입력 해주세요 ");
			
		}
	}
}

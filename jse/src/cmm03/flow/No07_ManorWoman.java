package cmm03.flow;

import java.util.Scanner;

public class No07_ManorWoman {
	public static void main(String[] args) {
		String ssn = "";
		Scanner scanner = new Scanner(System.in);
		ssn = scanner.nextLine();
		char ch = ssn.charAt(7);
		
		System.out.println("입력하세요  : ");
		
		
		if(ch == '1' ||  ch =='3'){
			
			System.out.println(" 남자 ");
			
		}else if(ch == '2' || ch == '4'){
			
			System.out.println(" 여자 ");
			
		}else{
			
			System.out.println(" 다시 입력 해주세요 ");
			
		}
	}
}

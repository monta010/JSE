package cmm03.flow;

import java.util.Scanner;



public class No02_IfElseDemo02 {
	public static void main(String[] args) {
		
		int kor,eng,math,sum = 0;
		//지역변수 선언시 디폴트값을 준다 (kor = 0)
		double avg = 0.0;
		String msg = "message";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("성적을 입력하세요 ");
		System.out.println("국어 ");
		kor = scanner.nextInt();
		System.out.println("영어 ");
		eng = scanner.nextInt();
		System.out.println("수학 ");
		math = scanner.nextInt();
		
		sum = kor + eng + math;
		avg = (int)sum/3;
		
		//avg = Math.floor(sum/3);
			
		
		if(avg==100){
			msg = "보너스지급";
		}else if(avg > 70){
			msg = "시험 합격입니다";
		}else{
			msg = "재 시험을 보세요";
		}
		
		System.out.println("성적을 입력하세요 ");
		System.out.println("국어 =" + kor);
		System.out.println("영어 =" + eng);
		System.out.println("수학 =" + math);
		System.out.println("평균 =" + (int)avg);
		System.out.println("귀하의 시험 결과 =" + msg +" 입니다 ");
		
	
		
		
	}
}

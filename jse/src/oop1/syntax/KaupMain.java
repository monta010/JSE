package oop1.syntax;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double height=0;
		double weight=0;
		int idx=0;
		
		KaupVO vo = new KaupVO(height, weight);
		System.out.println("키를 입력해 주세요.");
		height = sc.nextDouble();
		System.out.println("몸무게를 입력해 주세요.");
		weight = sc.nextDouble();
		
		vo.setHeight(height);
		vo.setWeight(weight);
		
		//int idx = (int)(weight / (height * height)) ;
		System.out.println(idx);
		
		//vo.setIdx(idx);
		vo.getMsg();
		System.out.println(vo.toString());
		System.out.println("완료");
	}
}

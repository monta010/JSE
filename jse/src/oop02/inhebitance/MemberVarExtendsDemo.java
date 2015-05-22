package oop02.inhebitance;

/*
Data : 2015.05.22
Author
Desc : 맴버변수 상속에 관한 예제
 * */

/*
부모 클래스 ◁- 자식클래스
 * */
class Car{
	String name = "자동차";
}
class Hcar extends Car{
	String brand = "현대";
}

class Dcar extends Car{
	String brand = "대우";
}

public class MemberVarExtendsDemo {

	public static void main(String[] args) {
		Hcar h = new Hcar();
		
		System.out.print(h.brand + "\t");
		System.out.println(h.name +  "\t");
		
		Dcar d = new Dcar();
		
		System.out.print(d.brand + "\t");
		System.out.println(d.name);
	}
}

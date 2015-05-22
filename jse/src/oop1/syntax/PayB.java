package oop1.syntax;

public class PayB {
	public static void main(String[] args) {
		PayA hulk = new PayA();
		PayA iron = new PayA();
		PayA thor = new PayA();
		
		hulk.name = "헐크";
		hulk.salary = 200;
		iron.name = "아이언";
		iron.salary = 300;
		thor.name = "토르";
		thor.salary = 500;
		
		hulk.setTax(hulk.salary);
		hulk.setIncome(hulk.salary);
		System.out.println("=== "+hulk.name+"의 5월 급여내역 ===");
		System.out.println("급여 : " + hulk.salary);
		System.out.println("세금 : " + hulk.TAX);
		System.out.println("실수령액 : " + hulk.income);
		System.out.println();
		iron.setTax(iron.salary);
		iron.setIncome(iron.salary);
		System.out.println("=== "+iron.name+"의 5월 급여내역 ===");
		System.out.println("급여 : " + iron.salary);
		System.out.println("세금 : " + iron.TAX);
		System.out.println("실수령액 : " + iron.income);
		System.out.println();
		thor.setTax(thor.salary);
		thor.setIncome(thor.salary);
		System.out.println("=== "+thor.name+"의 5월 급여내역 ===");
		System.out.println("급여 : " + thor.salary);
		System.out.println("세금 : " + thor.TAX);
		System.out.println("실수령액 : " + thor.income);
		System.out.println();
	}
}

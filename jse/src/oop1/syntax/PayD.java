package oop1.syntax;

public class PayD {
	public static void main(String[] args) {
		PayC Hulk = new PayC();
		PayC Iron = new PayC();
		PayC Thor = new PayC();
		
		Hulk.setName("헐크");
		Hulk.setSalary(200);
		Iron.setName("아이언");
		Hulk.setSalary(300);
		Thor.setName("토르");
		Hulk.setSalary(500);

		Hulk.setTax(Hulk.getSalary());
		Hulk.setIncome(Hulk.getSalary());
		System.out.println("=== "+Hulk.getName()+"의 5월 급여내역 ===");
		System.out.println("급여 : " + Hulk.getSalary());
		System.out.println("세금 : " + Hulk.getTaxval());
		System.out.println("실수령액 : " + Hulk.getIncome());
		System.out.println();
		Iron.setTax(Iron.getSalary());
		Iron.setIncome(Iron.getSalary());
		System.out.println("=== "+Iron.getName()+"의 5월 급여내역 ===");
		System.out.println("급여 : " + Iron.getSalary());
		System.out.println("세금 : " + Iron.getTaxval());
		System.out.println("실수령액 : " + Iron.getIncome());
		System.out.println();
		Thor.setTax(Thor.getSalary());
		Thor.setIncome(Thor.getSalary());
		System.out.println("=== "+Thor.getName()+"의 5월 급여내역 ===");
		System.out.println("급여 : " + Thor.getSalary());
		System.out.println("세금 : " + Thor.getTaxval());
		System.out.println("실수령액 : " + Thor.getIncome());
		System.out.println();
		
	}
}

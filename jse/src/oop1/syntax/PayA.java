package oop1.syntax;

public class PayA {
	String name;
	int salary; // 급여
	double TAX = 0.1; // 세율 0.1
	int income; // 실급여 = 급여 - 급여 * 세율
	
	public void setTax(int salary){
		this.TAX =(int) (salary * TAX);
	}//TAX의 값을 set 시킴(최신화)
	
	public void setIncome(int salary){
		this.income = (int)(salary - TAX);
	}
	
	
}

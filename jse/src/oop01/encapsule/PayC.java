package oop01.encapsule;

public class PayC {
	private String name;
	private int salary; // 급여
	public static final double TAX = 0.1; // 세율 0.1
	private int income; // 실급여 = 급여 - 급여 * 세율
	private int taxval;
	
	public void setTax(int salary){
		this.taxval = (int) (salary * TAX);
	}//TAX의 값을 set 시킴(최신화)
	
	public void setIncome(int salary){
		this.income = (int)(salary-salary * TAX);
	}
	// Alt + Shift + s - getter and setter : getter와 setter만듬
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getTaxval() {
		return taxval;
	}

	public void setTaxval(int taxval) {
		this.taxval = taxval;
	}

	public int getIncome() {
		return income;
	}
	
}

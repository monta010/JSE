package oop07.nestedClass;

import oop07.nestedClass.InnerClassInstance.Inner;


public class InnerClassMain {
	public static void main(String[] args) {
		InnerClassMain inn = new InnerClassMain();
	//	inn.getInnerClassInstance(); 인스턴스 내부클래스 호출시
		inn.getInnerClassLocal();
	}
	/*		
	내부 클래스 형태중 ...첫번째인 인스턴스 내부클래스 호출 방법
	* */
	public void getInnerClassInstance(){
		InnerClassInstance.Inner inner = new InnerClassInstance().new Inner();
		inner.printData();
	}
	public void getInnerClassStatic(){
		//스태틱 클래스는 객체를 생성하지 않고..클래스에서 직접 접근한다
		//따러서 InnerClassStatic.Inner() 으로 접근하는 형태에 주의 !!
		InnerClassStatic.Inner inner = new InnerClassStatic.Inner();
		inner.printData();
		
	}
	public void getInnerClassLocal(){
		InnerClassLocal outer = new InnerClassLocal();
		outer.innerTest(1000);
	}
	
}

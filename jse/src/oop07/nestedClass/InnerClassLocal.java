package oop07.nestedClass;

public class InnerClassLocal {
	int a = 100;
	public void  innerTest(int k){
		int b = 200;
		final int c= k ;
		class Inner{
			public void getData(){
				System.out.println("멤버변수 a : " + a);
				System.out.println("상수  c : " + c);
				/*
				 * System.out.println("지역변수 b " +| b);
				 * 이렇게 코딩하면 b 에서 참조할 숭 벗다는
				 * 에러 메시지가 뜬다. 
				 * */
			}
		}
		Inner inn = new Inner();
		inn.getData(); //일회용 클래스 , 연산이 끝나면 사라진다
		
		// new Inner(){}.getData();
	}
}

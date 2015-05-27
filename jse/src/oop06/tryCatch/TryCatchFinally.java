package oop06.tryCatch;

/*
....finally
예외 발생 여부와 관계없이
반드시 실행되는 구문
 * */
public class TryCatchFinally {
	public static void main(String[] args) {
	//	try{}catch(){}finally{}
		try{
			System.out.println("try 내부 매소드 실행중...");
		}catch(Exception ex){  //에러가 발생할때만 실행됨
			ex.printStackTrace();
			System.out.println("TryCatchFinally 클래스에서 에러발생 !!");
		}finally{ 
			System.out.println("finally 내부 실행");
		}
	}
}

package api01.lang.system;

import java.text.SimpleDateFormat;

public class CurrentTimeDemo {
	public static void main(String[] args) {
		/*
		 system 이 스태틱 클라스라서
		 스태틱 메소드인 currentTimeMillis() 를
		 객체 생성 없이 (new system 이런식의형태 없이)
		 바로 메소드를 호출한다
		 * */
		long curTime = System.currentTimeMillis();
		System.out.println("현재시간 : "+ curTime);
		/*
		 이 결과는 현재시간 : 1432779465383 나온다.
		 이것은 프로그램 내부에서 인식하는 시간값으로 
		 사용자가 인식하는 시간으로 변환해야 한다.
		 * */
		
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		String nowTime =sdf.format(curTime);
		System.out.println("현재시간 : "+ nowTime);
		
	}
}

package api01.lang.math;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		
		
		/*Calendar 의 GetInstance() 는 스태틱이라
		 * 클래스를 통해 바로 불러와서 인스턴스를 생성한다.
		 * 그래서  new Calendar() 와 같은
		 * 생성자 문법을 사용하지 않고 아래처럼 생성한다.
		 * 
		 * */
		Calendar date = Calendar.getInstance();
		System.out.print("오늘날짜");//Println 은 개행까지  포함이고, ln 를 지우면 개형이 없다.
		System.out.println(date.get(Calendar.YEAR)+"년");
		System.out.println((date.get(Calendar.MONTH)+1)+"년");
		System.out.println(date.get(Calendar.DATE)+"일");
		
		/*
		 위 결과를 그대로 출려하면 오늘 날짜 : 2015년 4월 29일 라고 나온다
		 자바 API 튜토리얼을 보면.. " Calendars is JANUARY which is 0" 이라고 나왔있다.
		 따라서 월은 0 부터 시작하므로 위 식에서 1을 더해서 출력해야한다.
		 (date.get(calendar.MONTH)+1) 괄호위쳉 주의!1
		 * */
		System.out.println();
		System.out.println("현재시간");
		System.out.println(date.get(Calendar.HOUR)+"시");
		System.out.println(date.get(Calendar.MINUTE)+"분");
		System.out.println(date.get(Calendar.SECOND)+"초");
		
		
		/*
		 프로그램 트라이얼 보면 30일 사용제한 같은 것이 걸린 것은 본 케이스라면..
		 30일 후에의 시간을 자동으로반환하는 로직도 필요합니다.
		 아래와 같이 처리하면 됩니다. 
		 * */
		
		System.out.println("현재 기준 임의의 시간을 설정할때");
		System.out.println("30일 후의 날짜를 얻고자 할때");
		date.add(Calendar.DATE,30);
		System.out.println(toString(date));
		System.out.println("7시간전의 시간을 얻고자 할때");
		date.add(Calendar.HOUR,7);
		System.out.println(toString(date)); //스태틱이라 객체 생성 없이 바로 가져다 씀
		
		/*
		 스케줄 프로그램을 작성할때 특정일자를 픽스해야 하는 경우에는 다음과 같이 처리.
		 * */
		
		date.set(Calendar.HOUR,22);
		date.set(Calendar.MINUTE,30);
		date.set(Calendar.SECOND,45);
		System.out.println("수정된 시간은 : ");
		System.out.println(date.get(Calendar.YEAR)+"시");
		System.out.println(date.get(Calendar.MINUTE)+"분");
		System.out.println(date.get(Calendar.SECOND)+"초");
		
		/*
		 바로 출력을 하면 스시템에서 제공하는 시간들이 나옵니다.
		 따라서 tostring() 을 오버라이딩 해야합니다.
		 여기서는 static 으로 별도로 작성합니다
		 * */
		
	}	
	public static String toString(Calendar date){	
		return  date.get(Calendar.HOUR)+"년"
				+date.get(Calendar.MONTH)+"월"
				+date.get(Calendar.DATE)+"일";
		
	}
}

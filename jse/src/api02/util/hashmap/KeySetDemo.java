package api02.util.hashmap;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;


public class KeySetDemo {
	public static void main(String[] args) {
		Map map = new HashMap();
		/*
		 * 맵에서 데이터를 추가하는 방법[Set]
		 * */
		//new Integer(98) 는 숫자타입이 아닌 객체 (98)
		map.put("김연아", new Integer(98));   //입력
		map.put("아사다 마오", new Integer(60));
		map.put("소트니", new Integer(30));
		

		/*
		 * 맵에서 데이터를 읽어들이는 방법[Get]
		 * */
		Set set = map.entrySet();  //중복값 제거
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			//it.next() 를 코딩하면 에러가
			//발생하는데 Entry 로 캐스팅 하면 된다.
			Map.Entry e = (Entry) it.next();
			System.out.println("참가자 : " +e.getKey()
					+ ", 점수 : " + e.getValue()); 
			
		}
	}
}

package api02.util.hashmap;

import java.util.HashMap;
import java.util.Map;
/*
 * 객체지향의 4대 특징인 은닉화,상속,추상화,다양성 중
 * 추상화 + 다양성 을 구현하는 implements 입니다.
 * 인터페이스 구현 방식은 클래스명 다음에 implements 키워드 코딩후
 * 인터페이스를 입력하시고 나면, 클래스명에 빨간줄(에러)표시가 
 * 뜨는 데, 마우스를 대시면 add unimplements 를 클릭하세요.
 * 그럼 자동 오버라이딩이 됩니다.
 * */

public class MemberServiceImpl implements MemberService{

	Map<String , Object> map = new HashMap<String , Object>();
	//string = 키값 //object = value값
	
	MemberVO vo = new MemberVO();
	
	@Override
	public void join(String id, String password, String name, int age,
			String addr) {
		
		/*
		 * 1. VO 객체를 생성해서
		 * - DB 에 값이 저장되는 형상을 표헌한 것이다. 
		 * */
		
		vo.setId(id);
		vo.setPassword(password);
		vo.setName(name);
		vo.setAge(age);
		vo.setAddr(addr);
		
		/*
		 * 2. 인스턴스 변수값을 통합하여 운반 하고 검색할
		 * 컬렉션을 준비한다.
		 * */
		
		/*
		 * vo.getId() 가 가능 한 이유는 위 메소드인 vo.setId() 에서
		 * 저장한 인스턴스 변수 String id 를 같이 공유하며
		 * 바라보고 있기 때문이다.
		 * vo.getid() 를 "id" 라는 리터럴
		 * */
		map.put("id", vo.getId()); //string 값은 대소문자 구별한다.
		map.put("password", vo.getPassword());
		/*
		 * 1. 첫번째 에러 유형
		 * map.put(vo.getId(), vo.getPassword());
		 * 이건 개발자가 많이 하는 착각의 코딩
		 * */
		map.put("name", vo.getName());
		/*
		 * 2. 두번째 에러 유형
		 * map.put("age",vo.getAge()); 
		 * valueOf() 는 api.lang.string.valueOfDemo 참조
		 * */
		map.put("age", String.valueOf(vo.getAge()));
		map.put("addr", vo.getAddr());
		
		
	}

	@Override
	public void login(String id, String password) {
		/*
		 * join() 에  지역변수로 map 을 선언했더니..
		 * join() 만 그 값을 참조할 수 있고, login() 는
		 * 그 값을 볼 수 없어서 아래 map.get("id") 에서
		 * 사용할 수 없었다.
		 * 그래서 , 이 클래스의 메소드라면 그 값을 바라볼 수 있도록
		 * 필드에 선언해준다.
		 * */
		System.out.println("맵에 담긴  ID : " + map.get("id"));
		if(!map.containsKey("id")){
			System.out.println("입력하신 ID는 존재하지 않습니다."
					+ "다시 입력하세요");
		}else{
			/*
			 * 3. 세번째 에러 유형 NullpointerException
			 * ma.get(KEY) 에서 KEY 는 맵을 선언한
			 * 타입과 일치해야 하는데.. 현재 필드에 선언된 맵은
			 * <String,object>  이므로
			 * password  는 string 값이 되어야 합니다.
			 * 그래서 "password"로 해야 합니다.
			 * */
			if(!(map.get("password").equals(password))){
				System.out.println("비번이 다릅니다."
				+ "다시입력하세요");
			}else{
				System.out.println("환영합니다.."
						+ vo.getAddr()+"에 사시는"
						+ vo.getAge() + "세 되시는"
						+ vo.getName()+ "환영합니다");
			}
		}
	}

}

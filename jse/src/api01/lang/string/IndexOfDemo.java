package api01.lang.string;

public class IndexOfDemo {
	public static void main(String[] args) {

		String str = "Hello java world";
		/*
		 * IndexOf("s") : s 의 문자열 내부에서 의 위치값 리턴
		 * 인덱스는 0부터 시작하고 공백도 1칸으로 인정한다.
		 * */
		
		System.out.println("테스트용 단어 : " + str);
		int idx = str.indexOf('j');
		System.out.println(idx);
		
		idx = str.indexOf("java");
		System.out.println("Java 의 위치값 : " + idx);
		
		/*
		 DB 에 저장되는 ID 나 Password 의  경우
		 용량때문에 글자수를 제한하는 경우가 있는데,
		 회원가입시 글자수 체크해서 제한할 때 쓰임
		 * */
		idx = str.lastIndexOf('d');
		System.out.println("lastIndexOf 의 결과값 : " + idx ); 
		
		idx = str.indexOf('j');
		String str2 = str.substring(idx);
		System.out.println("j부터 끝까지 잘라내기" + str2 ); // lastIndexOf 의 결과값 : 15

	}

}

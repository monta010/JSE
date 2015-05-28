package api01.lang.string;

/*
java.lang.String 에서
SubString(n) 은 n 부터 끝까지 잘라낸다.
SubString(n m m) 은 n 부터  m까지 잘라낸다.
n < = x < m

 * */

public class SubStringDemo {
	public static void main(String[] args) {

		String str = "Hello java";
		System.out.println(str.substring(6));
		System.out.println(str.substring(6,8));
	}
}

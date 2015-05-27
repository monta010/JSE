package api01.lang.object;
// import java.lang.*;
// java.lang.* 는 따로 선언하지 않아도 디폴트로 가지고 있다.
public class TostringDemo {
	public static void main(String[] args) {
		Card card1 = new Card("heart",7);
		Card card2 = new Card("space",2);
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		
	}
}
class Card{
	String kind;
	int number;
	public Card(){
		this("",0); //오버로딩을 하겠다는 의사표시
		// 이클립스가 자동으로 오버로딩을 함.
	}
	public Card(String kind, int number) {
		this.kind =  kind;
		this.number = number;
	}
	// toString 을따로 구현하지 않음
	// Alt + Shift + s 단축기 : tostring 오버라이딩 [gernerate toString 선택]
	
	@Override
	public String toString() {
		return "카드 [무늬=" + kind + ", 숫자=" + number + "]";
	}
	
}

package cmm01.var;

public class EscapeDemo {
	
	public static void main(String[] args) {
		int kor = 90;
		int eng = 85;
		int sum = 0;
		
		sum = kor + eng;
		
		System.out.print("성적처리\n");
		System.out.println("===================");
		System.out.println("국어 \t영어 \t총점");
		//System.out.println(kor + eng + sum); 합쳐서 합계가 나옴
		System.out.println(kor+"\t"+eng+"\t"+sum);
		
		
	}

}

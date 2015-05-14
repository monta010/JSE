package cmm04.array;

public class No02_StringArrayDemo {
	public static void main(String[] args) {
		/*String[] juso = new string[3];
		juso[0] = "서울";
		juso[1] = "종로";
		juso[2] = "광화문";*/
		
		String[] juso = {"서울","종로","광화문"};
		
		for(int i =0; i<juso.length; i++){  //juso.length를 사용하면 배열 개수 상관없이 해도된다.
			System.out.println("출력값 :" +juso[i]);
		}
		
	}
}

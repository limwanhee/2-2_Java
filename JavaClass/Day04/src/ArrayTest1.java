
public class ArrayTest1 {
	public static void main(String[] args) {
		//배열의 크기가 10인 배열 생성 s
		//출력 : 0 1 2 3 4 5 6 7 8 9
		
		int[] s = new int[10];
		
		for (int i = 0; i < s.length; i++) {
			s[i] = i;
			System.out.print(i + " ");
		}
	}
}

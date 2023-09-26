
public class ArgMethod {
	static void hol(int num) {
		if(num % 2 == 1) {
			System.out.println(num + "는 홀수입니다.");
		}
		else {
			System.out.println(num + "는 짝수입니다.");
		}
	}
	public static void main(String[] args) {
		System.out.println("함수를 이용한 짝/홀수 판별입니다.");
		hol(5);
		hol(12);
	}

}

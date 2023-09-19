import java.util.Scanner;

public class SimpleFor {

	public static void main(String[] args) {
		int num, i;
		Scanner s = new Scanner(System.in);
		
		System.out.println("반복할 횟수 입력 : ");
		i = s.nextInt();
		for(num = 0; num < i; num++) {
			System.out.println("for 문을 이용하여 반복 실행됩니다");
		}

	}

}

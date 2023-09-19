import java.util.Scanner;

public class Game369 {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		num = s.nextInt();
		
		if(num % 3 == 0 || num % 6 == 0 || num % 9 == 0 || num / 10 == 3 || num / 10 == 6 || num / 10 == 9) {
			System.out.println("박수 짝!");
		}
		
		else if(num >= 100) {
			System.out.println("369게임은 100 이하의 숫자로 운영됩니다");
		}
		else {
			System.out.println(num);
		}

	}

}

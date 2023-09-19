import java.util.Scanner;

public class SimpleDoWhile {

	public static void main(String[] args) {
		int i, num;
		
		Scanner s = new Scanner(System.in);
		System.out.println("반복할 횟수를 입력하세요 : ");
		i = s.nextInt();
		num = 0;
		do {
			System.out.println("do-while 문을 이용하여 반복 실행됩니다");
			num++;
		}while(num < i);
		

	}

}

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		int cnt = 0, myNum, comNum;
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		comNum = r.nextInt(100);
		
		
		do {
			System.out.println("1부터 100까지 숫자를 고르시오 : ");
			myNum = s.nextInt();
			
			if (myNum < comNum) {
				System.out.println("제시한 정수보다 높습니다");
				cnt++;
			}
			
			else if(myNum > comNum) {
				System.out.println("제시한 정수보다 낮습니다");
				cnt++;
			}
			
		} while (myNum != comNum);
		
		System.out.println("맞췄습니다!");
		cnt++;
		System.out.println("시도 횟수 ="+ cnt);

	}	
}

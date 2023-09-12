package today;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		System.out.print("연도를 입력하세요 : ");
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "년은 윤년");
		}
		else {
			System.out.println(year + "년은 평년");
		}

	}

}

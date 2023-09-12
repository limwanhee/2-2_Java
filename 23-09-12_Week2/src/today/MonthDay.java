package today;

import java.util.Scanner;

public class MonthDay {

	public static void main(String[] args) {
		int num;
		int year;
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		System.out.print("일수가 궁금한 년도를 입력하시오 : ");
		year = s2.nextInt();
		
		System.out.print("일수가 궁금한 달을 입력하시오 : ");
		num = s.nextInt();
/*		
		switch(num) {
			case 1, 3, 5, 7, 8, 10, 12:
				System.out.println(num + "월의 일수는 31일 입니다");
				break;
				
			case 4, 6, 9, 11:
				System.out.println(num + "월의 일수는 30일 입니다");
				break;
			
			case 2:
				System.out.println(num + "월의 일수는 28일 입니다");
		}
*/
		switch(num) {
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(year+"년도의 " + num + "월의 일수는 30일 입니다");
				break;
			case 2:
				if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					System.out.println(year+"년도의 " + num + "월의 일수는 29일 입니다");
				}
				else {
					System.out.println(year+"년도의 " + num + "월의 일수는 28일 입니다");
				}
				
				break;
			default:
				System.out.println(year+"년도의 " + num + "월의 일수는 31일 입니다");
				break;
		}
		s.close();
	}

}

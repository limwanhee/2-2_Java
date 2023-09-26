import java.util.Scanner;

public class movieSeat {
    static void print_head() {
    	System.out.println("------------------------------------------");
    	}

	public static void main(String[] args) {
		int [] seats = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int seatNum;
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < seats.length; i++) {
			print_head();
			
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			
			for (int j = 0; j < seats.length; j++) {
				System.out.print(seats[i] + " ");
			}
			
			System.out.println();
			
			print_head();
			
			System.out.println("원하시는 좌석번호를 입력하세요(종료는 -1)");
			seatNum = s.nextInt();
			
			switch (seatNum) {
			case 1:
				if(seats[i] == 0) {
					seats[i] = 1;
				}				
				
				else {
					System.out.println("이미 예약된 자리입니다");
				}
			case -1:
				break;
			}
			
		}
		

	}

}

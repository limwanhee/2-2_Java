import java.util.Scanner;

public class movieSeat {
    static void print_head() {
    	System.out.println("------------------------------------------");
    	}

	public static void main(String[] args) {
			
		int [] seats = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int seatNum = 0;
		Scanner s = new Scanner(System.in);
		
		while(seatNum != -1) {
			print_head();
			
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			
			print_head();
			
			for (int j = 0; j < seats.length; j++) {
				System.out.print(seats[j] + " ");
			}
			
			System.out.println();
			
			print_head();
			
			System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1) : ");
			seatNum = s.nextInt();
			
			switch (seatNum) {
			case 1: //내가 선택한 좌석번호가 1번이면 
				if(seats[seatNum - 1] == 0) {//선택한 좌석번호 -1한 자리(배열 0번째)가 0이면
					seats[seatNum - 1] = 1; //선택한 좌석번호 -1한 자리(배열 0번째)에 1을 넣어라 
					break;
				}				
				
				else { //선택한 좌석번호 -1한 자리(배열 0번째)가 1이면
					System.out.println("이미 예약된 자리입니다"); 
					break;
				}
				//이하 동문 마지막은 case -1:
				//			         break;
			case 2:
				if(seats[seatNum - 1] == 0) {
					seats[seatNum - 1] = 1;
					break;
				}				
				
				else {
					System.out.println("이미 예약된 자리입니다");
					break;
				}
			case 3:
				if(seats[seatNum - 1] == 0) {
					seats[seatNum - 1] = 1;
					break;
				}				
				
				else {
					System.out.println("이미 예약된 자리입니다");
					break;
				}
			case 4:
				if(seats[seatNum - 1] == 0) {
					seats[seatNum - 1] = 1;
					break;
				}				
				
				else {
					System.out.println("이미 예약된 자리입니다");
					break;
				}
			case 5:
				if(seats[seatNum - 1] == 0) {
					seats[seatNum - 1] = 1;
					break;
				}				
				
				else {
					System.out.println("이미 예약된 자리입니다");
					break;
				}
			case 6:
				if(seats[seatNum - 1] == 0) {
					seats[seatNum - 1] = 1;
					break;
				}				
				
				else {
					System.out.println("이미 예약된 자리입니다");
					break;
				}
			case 7:
				if(seats[seatNum - 1] == 0) {
					seats[seatNum - 1] = 1;
					break;
				}				
				
				else {
					System.out.println("이미 예약된 자리입니다");
					break;
				}
			case 8:
				if(seats[seatNum - 1] == 0) {
					seats[seatNum - 1] = 1;
					break;
				}				
				
				else {
					System.out.println("이미 예약된 자리입니다");
					break;
				}
			case 9:
				if(seats[seatNum - 1] == 0) {
					seats[seatNum - 1] = 1;
					break;
				}				
				
				else {
					System.out.println("이미 예약된 자리입니다");
					break;
				}

			case 10:
				if(seats[seatNum - 1] == 0) {
					seats[seatNum - 1] = 1;
					break;
				}				
				
				else {
					System.out.println("이미 예약된 자리입니다");
					break;
				}
				
			case -1:
				break;
				
			}
		}
	}
}

import java.util.*;

public class MoiveResv {
	//좌석을 표시할 배열
	String [][] seat = new String[5][10]; //좌석 5행 10열 총 좌석 50개
	//좌석에 따른 배열의 행번호, 열번호, 기능동작
	char rn;
	int row_int, col, system;
	boolean confirm;
	//이름을 확인받을 변수, 이름을 받을 변수, 취소에 쓸 이름, 열 이름, 예약여부표시
	String con_char, name, c_name, row, q;
	String pw = "java"; //관리자 비밀번호
	//첫 시작 화면(인터페이스) 보여줌
	public void lnterface() {
	System.out.println("안녕하세요. 좌석 예약 시스팀입니다.");
	System.out.println("번호 선택하세요");
	System.out.print("예약(1),취소(2),좌석조회(3),좋료(4)");
	Scanner scan = new Scanner(System.in);
	
	try { 
		system = scan.nextInt();
		switch(system) {
		case 0: // 0번 입력하면 어드민 화면으로 감
			Admin();
			break;
		case 1 : // 1번 입력하면 예약자 화면으로 감
			Reservation();
			break;
		case 2 : // 2번 입력하면 취소 화면으로 감
			Cancel();
			break;
		case 3 : // 3번 입력하면 참고 화면으로 감
			Reference();
			break;
		case 4 : // 4번 입력하면 시스템 종료
			System.out.println("시스템 종료");
			break;
		}
	} 
	
	catch (InputMismatchException e) {
	System.out.println("잘못된 입력.");
	}
	}
	//관리자 모드로 좌석 조회와 취소가 가능함, 비밀번호를 입력받아서 로그인 기능 만듬
	public void Admin() {
		System.out.print("관리자 비밀번호를 입력: ");
		Scanner scan = new Scanner(System.in);
		if(scan.nextLine().equals(pw)) {
			System.out.println("관리자 로그인 되었습니다.");
			confirm = true;
			do {
				try {
					System.out.print("취소(1), 좌석조회(2), 종료(3): ");
					system = new Scanner(System.in).nextInt();
					switch (system) {
					case 1 :
						AdminCance1();
						break;
						
					case 2 :
						AdminRef();
						break;
						
					case 3 :
						System.out.println("관리자모드 종료");
						confirm = false;
						break;
						
				} //입력이 잘못되면 오류 해결
			} catch (InputMismatchException e) {
					System.out.println("잘못된 입력");
			}
		} while (confirm);
	}else {
	System.out.println("잘못된 비밀번호. \n");
	}
}
	
		public void lnitialize() {
			for(int i=0;i<5;i++) {
				for(int j=0;j<10;j++) {
					seat[i][j]="____";
				}
			}
		}
					
			
		//관리자 모드에서 좌석 조회
		public void AdminRef() {
			rn = 'A';
			for(int i=0;i<5;i++) {
				System.out.println(rn+"열 ");
				col = 1;
				rn++;
				for(int j=0;j<10;j++) {
					q = seat[i][j].equals("____")?" ◻ ":" ◼ ";
					System.out.print(col + q);
					col++;
				}
			System.out.println();
				}
			}
		//좌석 조회 기능
		public void Reference() {
		rn = 'A';
		
		for(int i=0;i<5;i++) {
			System.out.print(rn+"열 ");
			col = 1;
			rn++;
			
			for(int j=0;j<10;j++) {
				q = seat[i][j].equals("____")?" ◻ ":" ◼ ";
				System.out.print(col + q);
				col++;
			}
		System.out.println();
		}
		}
		//예약 화면
		public void Reservation() {
			Reference();
			do {
				confirm = true ;
				System.out.print("예약자 성할들 입력하세요 : ");
				Scanner scan = new Scanner(System. in);
				name = scan.nextLine();
				System.out.println("예약자 성할들 입력하세요 : "+name);
				System.out.print("맞으면 Y, 를리면 N : ");
				con_char = scan.next();
				confirm=(con_char.equals("Y")) ||con_char.equals("y")?false:true;
			} while (confirm);
			do {
				confirm = true;
				System.out.print("열을 선택하세요(A~E): ");
				Scanner scan = new Scanner(System. in);
			try {
				row = scan. next();
			} catch (Exception e) {
				System.out.println("A~E만 입력하세요");
			}
			if(row.equals("A")||row.equals("a")){
				row_int = 0;
				confirm = false;
			}
			else if(row.equals("B")||row.equals("b")){
				row_int = 1;
				confirm = false;
			}
			else if(row.equals("C")||row.equals("c")) {
				row_int = 2;
				confirm = false;
			}
			else if(row.equals("D")||row.equals("d")) {
				row_int = 3;
				confirm = false;
			}
			else if(row.equals("E")||row.equals("e")) {
				row_int = 4;
				confirm = false;
			}
			else {
				System.out.println("A~E만 입력하세요");
			}
			} while (confirm);
			do {
				confirm = true;
				Scanner scan = new Scanner(System. in);
				try {
				System.out.print("좌석 번호를 선책해주세요. 1~10: ");
				col = scan.nextInt();
				if(col>=1 && col <= 10) {
					if(seat[row_int][col-1].equals("____")) {
						seat[row_int][col-1]=name;
						confirm = false;
					}	
					else {
						System.out.println("이미 예약된 자리입니다.");
					}	
				}
				else {
					System.out.println("좌석은 1~l0번까지 입닉다.");
				}
			} 
				catch (Exception e) {
					System.out.println("좌석은 1~10번가치 입니다. ");
				}
			} while(confirm);
				System.out.println(seat[row_int][col-1]+"님 "+row+"열"+col+"번 으로 예약됨.");
				Reference();
			}
			public void AdminCance1() {
				System.out.println("이름을 입력");
				Scanner scan = new Scanner(System.in);
				c_name = scan.nextLine ( );
			for(int i=0;i<5;i++) {
				for(int j=0;j<10;j++) {
					if(seat[i][j].equals(c_name)) {
						seat[i][j]="____";
						System.out .println(c_name+"취소가 완료.");
						AdminRef();
					}
				}
				}
			}
			//취소 화면
			public void Cancel() {
				System.out.println("이름을 입력하세요");
				Scanner scan = new Scanner (System.in);
				c_name = scan.nextLine();
			for(int i=0;i<5;i++) {
				for(int j=0;j<10;j++) {
					if(seat[i][j].equals(c_name)) {
					seat[i][j]="____";
					System.out.println(c_name+"님 쥐승가 완료되었습니다.");
					AdminRef();
					}
				}
			}
			}
			//메인 메소드
			public static void main(String[] args) {
				MoiveResv movie = new MoiveResv();
				movie .lnitialize();
				while(true) {
					movie .lnterface();
					if(movie.system == 4) {
						break;
					}
				}
			}
}
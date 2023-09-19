import java.util.Scanner;

public class dowhileLoop {

	public static void main(String[] args) {
		int month;
		
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("알고싶은 월의 정보 입력");
			month = s.nextInt();
		}while(month < 1 || month > 12);
		
	}

}

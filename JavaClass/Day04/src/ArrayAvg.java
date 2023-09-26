import java.util.Scanner;

public class ArrayAvg {

	public static void main(String[] args) {
		int[] num = new int[10];
		double avg;
		int total = 0;
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + 1 + "번째 수를 입력하세요 : ");
			num[i] = s.nextInt();
			
			total += num[i];
			
			
		}
		avg = (double)total/num.length;
		System.out.println("입력한 수는 ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " ");
		}
		System.out.println(" 이고 평균은 " + avg + "입니다.");
	}

}

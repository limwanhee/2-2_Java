import java.util.Scanner;

public class forHap {
	public static void main(String[] args) {
		int n, sum, set, max;
		sum = 0;
		
		Scanner ns = new Scanner(System.in);
		Scanner sums = new Scanner(System.in);
		
		System.out.println("어디부터 더할지 입력하시오 : "); //수업에선 안했지만 추가함
		set = ns.nextInt();
		
		System.out.println("어디까지 더할지 입력하시오 : ");
		max = sums.nextInt();
		
		
		for(n = set; n <= max; n++) {
			sum += n;
		}
		System.out.println(set + "부터 " + max + "까지의 합은" + sum + "입니다.");
	}
}

import java.util.*;

public class Simpleif {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.println("점수를 입력하세요 : ");
		num = s.nextInt();
		
		if(num > 90) {
			System.out.println("우수한 성적입니다");
		}
		System.out.println("당신의 점수는 " + num + "점입니다");
		s.close();

	}

}

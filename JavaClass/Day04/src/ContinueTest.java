
public class ContinueTest {
	public static void main(String[] args) {
		String s = "no news is good news";
		int n = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != 'n') { //문자열 s의 i번째가 n이 아니라면 
				continue;
			}
			n++;
		}
		System.out.println("문자에서 발견된 n의 개수 " + n);
		System.out.println(s.length());
	}
}

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		int [] a = new int[10];
		a[0] = 11;
		a[1] = 13;
		a[2] = 43;
		a[3] = 23;
		a[4] = 98;
		a[5] = 56;
		a[6] = 87;
		a[7] = 23;
		a[8] = 56;
		a[9] = 26;
		Arrays.sort(a);
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("[i="+i+"]---------["+a[i]+"]");
		}
		

	}

}

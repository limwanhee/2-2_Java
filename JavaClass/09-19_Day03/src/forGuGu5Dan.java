
public class forGuGu5Dan {

	public static void main(String[] args) {
		int i;
		
		for(i = 1; i < 10; i++) {
			System.out.println("5 x "+ i + " = "+ 5 * i);
			if(i % 3 == 0) {
				System.out.println("\n");
			}
			else {
				System.out.println("\t");
			}
		}
		System.out.println("\n\n");
	}

}

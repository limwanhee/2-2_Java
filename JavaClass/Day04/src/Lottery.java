
public class Lottery {

	public static void main(String[] args) {
		//경우의 수 = 45 * 44 * 43 * 42 * 41 * 40 = 5864443200
		//6! = 6 * 5 * 4 * 3 * 2 * 1 = 720, 5864443200 / 720 = 8,145,060 -> (45 -i + 1) / i
		int odds = 1;
		final int n = 45; //로또 갯수
		final int k = 6; //로또 뽑을 횟수
		
		for (int i = 1; i < k; i++) {
			odds = odds * (n - i + 1) / i;
		}
		System.out.println("로또 1등 확률 : 1/"+odds);
	}

}

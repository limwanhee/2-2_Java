public class AccessEx1Test {

	public static void main(String[] args) {
		AccessEX1 a = new AccessEX1();
		a.n1 = 10;
		a.Setn2(20);
		System.out.println("멤버 변수의 값은 "+a.n1+", "+a.Getn2());
	}

}


public class OverLoadTestDouble {

	public static void main(String[] args) {
		OverLoadDouble  Ov = new OverLoadDouble();
		System.out.println("int 유형의 인수 결과 : " + Ov.Calc(2, 5));
		System.out.println("Double 유형의 인수 결과 : " + Ov.Calc(2.0, 5.0));
	}

}

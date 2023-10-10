public class ThisExTest2 {
	public ThisExTest2() {
		this(10);
		System.out.println("첫번째 생성자입니다.");
	}
	public ThisExTest2(int n) {
		System.out.println("두번째 생성자입니다." + n);
	}
}

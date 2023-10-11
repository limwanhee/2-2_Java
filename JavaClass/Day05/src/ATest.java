
public class ATest {

	public static void main(String[] args) {
		A obj = new A();
		//obj.a = 10; //전용 멤버는 다른 클래스에서 접근이 안됨 이 문장은 사용 불가
		
		obj.b = 20;
		obj.c = 30;
		System.out.println(obj.b);
		System.out.println(obj.c);
		
		
	}

}

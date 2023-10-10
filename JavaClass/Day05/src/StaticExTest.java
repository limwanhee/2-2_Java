public class StaticExTest {

	public static void main(String[] args) {
		StaticEx a1 = new StaticEx();
		StaticEx a2 = new StaticEx();
		a1.ins = 5;
		a2.ins = 500;
		System.out.println("인스턴스 변수의 값은 " + a1.ins + ", " + a2.ins+" 입니다.");
		a1.stc = 7;
		a2.stc = 700; //static 변수는 마지막에 들어간 값이 둘다 작동을 한다 Circle.java 참고
		System.out.println("클래스 변수의 값은 " + a1.stc + ", " + a2.stc + " 입니다.");
	}

}


public class ClassPrt {
	void PrtMasg() {
		System.out.println("====================================");
		System.out.println("ClassPrt 클래스를 객체로 생성한 메세지입니다.");
		System.out.println("===================================");
	}

	public static void main(String[] args) {
		ClassPrt Msg = new ClassPrt();
		Msg.PrtMasg();

	}

}

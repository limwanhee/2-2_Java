public class Circle {
	static final double PI = 3.14; //안 변하는 값인 PI는 이런식으로 static 응용 가능 //final을 붙여주면 재정의가 불가능하고 클래스에다가 선언하면 재선언이 불가능함
	double r, circum, area;
	void CircleCalc(double n) {
		r = n;
		circum = 2 * PI * r;
		area = r * r * PI;
		ShowResult(this);
	}
	void ShowResult(Circle c) {
		System.out.println("반지름이 " + c.r +"인 원의 둘레는 " + c.circum + " 면적은 " + area);
	}
}

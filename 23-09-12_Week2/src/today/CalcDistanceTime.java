package today;

public class CalcDistanceTime {

	public static void main(String[] args) {
		 //final은 상수를 정의한다
		final double light_speed = 30e4;
		double distance = 40e12;
		double secs;
		secs = distance/light_speed;
		double light_year = secs/(60.0*60.0*24.0*365.0);
		
		
		System.out.println("걸리는 시간은 " + light_year + "광년입니다");
		

	}

}

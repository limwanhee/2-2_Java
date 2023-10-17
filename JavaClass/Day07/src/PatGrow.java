import java.util.Scanner;

class Pat{
	public String race;
	public String name;
	public int age;
	public int power;
	public int energy;
	int count = 0;
	public Pat() { // 부모 클래스
		System.out.println("시작");
	}
	public void eat() { //밥먹기, 잠자기, 운동하기, 공격하기 중 밥을 먹거나 잠을 4번 자도록하면 aging() 메소드를 통해 나이가 늘어나게 만듬
		energy += 15;
		count++;
		aging();
	}
	public void sleep() {
		energy += 5;
		count++;
		aging();
	}
	public void exercise() {
		energy -= 10;
		power += 10;
	}
	public void aging() {
		 if(count>3) {
			 age++;
			 count = 0;
		 }
	}
	public void attack() {
		energy -= 15;
		power += 20;
	}
	public void print() {
		System.out.println("나이: "+age);
		System.out.println("파워: "+power);
		System.out.println("에너지: "+energy);
	}
}
class Dog extends Pat{ //부모인 pat 클래스로부터 상속을 받아 Dog 클래스를 만듦
	public int count;
	public Dog(String name) {
		this.name = name;
		race = "강아지";
		age = 0;
		power = 200;
		energy = 300;
		count = 0;
		System.out.println("강아지("+name+")가 만들어졌습니다.");
	}
	public void eat() {   //부모에서 상속 받은 메소드를 다시 재정의 함으로써 운동에서 강점을 만듦(오버 라이딩)
		energy += 15;
		count++;
		aging();
	}
	public void sleep() {
		energy += 5;
		count++;
		aging();
	}
	public void exercise() {
		energy -= 20;
		power += 20;
	}
	public void aging() {
		if(count>3) {
			age++;
			count = 0;
		}
	}
	public void print() {
		System.out.println("나이: "+age);
		System.out.println("파워: "+power);
		System.out.println("에너지: "+energy);
	}
}
class Cat extends Pat{ //부모인 pat 클래스를 상속 받아 Cat 클래스를 만듦 (행동 관련 부분은 메소드 오버라이딩하지 않음)
	public int count;
	public Cat(String name) {
		this.name = name;
		race = "고양이";
		age = 0;
		power = 100;
		energy = 200;
		count = 0;
		System.out.println("고양이("+name+")가 만들어졌습니다.");
	}
}
class Rabbit extends Pat{ //부모인 pat 클래스를 상속 받아 Rabbit 클래스를 만듦
	public int count;
	public Rabbit(String name) {
		this.name = name;
		race = "토끼";
		age = 0;
		power = 200;
		energy = 300;
		count = 0;
		System.out.println("토끼("+name+")가 만들어졌습니다.");
	}
	public void eat() {//부모 클래스에서 메소드를 상속 받아 재정의를 했음(메소드 오버라이딩)
		energy += 5;
		count++;
		aging();
	}
	public void sleep() {
		energy += 3;
		count++;
		aging();
	}
	public void exercise() {
		energy -= 3;
		power += 7;
	}
	public void aging() {
		if(count>3) {
			age++;
			count = 0;
		}
	}
	public void attack() {
		energy -= 10;
		power += 10;
	}
	public void print() {
		System.out.println("나이: "+age);
		System.out.println("파워: "+power);
		System.out.println("에너지: "+energy);
	}
}

public class PatGrow {
	public static void main(String[] args) { //메인 메소드
		Scanner sc = new Scanner(System.in);
		Pat p = null;
		System.out.println("애완동물을 선택."); //동물 선택후
		System.out.print("1. 강아지, 2. 고양이, 3. 토끼");
		int x = sc.nextInt();
		System.out.println("애완동물의 이름 입력:"); // 동물 이름 입력 받고
		String name = sc.next();
		if(x==1) { // 입력 받은게 (1번이면 Dog 메소드를 생성)
			p = new Dog(name);
		}else if(x==2) { // 입력 받은게 (2번이면 Cat 메소드를 생성)
			p = new Cat(name);
		}else if(x==3) { // 입력 받은게 (3번이면 Rabbit 메소드를 생성)
			p = new Rabbit(name);
		}
		boolean flag = true;
		while(flag) { //위 문장에서 flag값을 true로 설정했기에 무한 반복
			System.out.println("메뉴");
			System.out.println("1. 밥먹기 2. 잠자기 3. 운동하기 4. 공격 5. 끝"); // 번호를 선택해 무엇을 할지 정함
			x = sc.nextInt();
			switch (x) { // 번호가
			case 1: // 1번이면
				p.eat(); //위에서 번호를 선택해 자기가 원하는 동물의 객체를 생성했고 그 동물 클래스 안에 메소드를 실행함
				p.print();
				break;
			case 2: // 2번이면
				p.sleep();
				p.print();
				break;
			case 3: // 3번이면
				p.exercise();
				p.print();
				if(p.energy<=0) { // 만약에 동물의 에너지가 0이되면 flag 값을 false로 변경해 무한 반복문을 빠져나가게 만들고 게임 종료 출력
					System.out.println("게임 종료");
					flag = false;
				}
				break;
			case 4:
				p.attack();
				p.print();
				if(p.energy <=0) { // 만약에 동물의 에너지가 0이되면 flag 값을 false로 변경해 무한 반복문을 빠져나가게 만들고 게임 종료 출력
					System.out.println("게임 종료");
					flag = false;
				}
				break;
			case 5: //게임 종료
				flag = false; 
			}
		}
	}
}
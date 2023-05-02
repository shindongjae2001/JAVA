package chap08;

public class CarTest {

	public static void main(String[] args) {
		Car myCar=new Car();
		
		//필드값 읽기
		System.out.println("제작회사:"+myCar.company);
		System.out.println("모델명:"+myCar.model);
		System.out.println("현재속도:"+myCar.speed); //묵시적 값 출력
		
		//필드 값 변경
		myCar.speed=60;
		System.out.println("수정된속도:"+myCar.speed);

	}

}

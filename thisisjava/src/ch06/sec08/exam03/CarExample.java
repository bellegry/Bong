package ch06.sec08.exam03;

public class CarExample {
	public static void main(String[] args) {
		// Car 객체 생성
		Car cal = new Car();
		
		// 리턴값이 없는 setGas() 메소드 호출
		cal.setGas(5);
		
		// isLeftGas() 메소드를 호출해서 받은 리턴값이 true 일 경우 if 블록 실행
		if(cal.isLeftGas()) {
			System.out.println("출발합니다.");
			
			// 리턴값이 없는 run() 메소드 호출
			cal.run();
		}
		
		System.out.println("gas를 주입하세요.");
	}
}

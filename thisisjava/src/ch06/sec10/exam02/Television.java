package ch06.sec10.exam02;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	
	// 정적 필드는 생성자를 초기화 하지 않아도 사용 가능!
	// 생성자는 객체 생성 후 실행되기 때문
	static {
		info = company + "-" + model;
	}
}

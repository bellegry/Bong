package ch04.test;

public class test02 {
	public static void main(String[] args) {
		// 1. 2
				// 2.
				
				String grade = "B";
				
				int score1 = 0;
				if(grade.equals("A")) {
					score1 = 100;
				} else if(grade.equals("B")) {
					int result = 100 - 20;
					score1 = result;
				} else {
					score1 = 60;
				}
				
				System.out.println(score1);
	}
}

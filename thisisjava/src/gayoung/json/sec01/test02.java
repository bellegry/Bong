package gayoung.json.sec01;

public class test02 {
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		int k = 1;
		while(i <= 5) {
			System.out.print("i : " + i + "\n");
			i++;
			while(j <= 5) {
				System.out.print("j : " + j + "\n");
				j++;
				while(k <= 5) {
					System.out.print("k : " + k + "\n");
					k++;
				}
				break;
			}
		}
	}
}

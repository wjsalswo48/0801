
public class Practice2 {
	public static void main(String[] args) {
		int num=1;
		for(int i = 0; i<5; i++) {
			for(int j =i+1; j<=5+i; j++) {
				System.out.printf("%d",j);
			}
			System.out.println();
		}
	}
}

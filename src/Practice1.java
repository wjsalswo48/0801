import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("초를 입력하시오");
		int s = sc.nextInt();
		int sec = s;
		int hour = sec/3600;
		sec%=3600;
		int min = sec/60;
		sec %= 60;
		System.out.printf("%d초는 %d시간 %d분 %d초입니다.",s,hour,min,sec);
	}
}

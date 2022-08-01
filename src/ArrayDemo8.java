import java.util.Scanner;

public class ArrayDemo8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개의 제품을 만드시겠습니까?:");
		int num = sc.nextInt();
		sc.nextLine();
		Product[]array = new Product[num];
		
		for(Product p : array) {
			p = new Product();
			System.out.print("제품 이름 : ");p.name=sc.nextLine();
			System.out.print("제품 가격 : ");p.price=sc.nextInt();
			sc.nextLine();
			System.out.print("제품 색상 : ");p.color=sc.nextLine();
			
			p.display();
			System.out.println();
		}
	}
}

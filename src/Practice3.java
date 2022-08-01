import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int []arr1={50000,10000,5000,1000,500,100,50,10,5,1};
		int []arr2=new int[10];
		int len =arr1.length;
		int money = 0;
		for(int i =0; i<len;i++) {
			arr2[i] = num/arr1[i];
			num%=arr1[i];
		}
		for(int i =0; i<len;i++) {
			System.out.printf("%d원권 : %d\n",arr1[i],arr2[i]);
		}
	}
}

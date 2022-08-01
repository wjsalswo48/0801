import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {
//		int [] array = new int[4];
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i = 0; i<4; i++) {
//			System.out.print(i+"번째 숫자 :");
//			array[i]=sc.nextInt();
//		}
//		for(int i = 0; i<4; i++) {
//			System.out.println(i+"번째 값 :"+array[i]);
//		}
		Student [] array = new Student[2]; // 배열선언및 할당
//		for(int i = 0; i<2; i++) {
//			System.out.printf("array["+i+"]="+array[i]+"\t\t");
//		}
//		System.out.println();
		
		for(int i = 0; i<2; i++) {
			array[i] = new Student();
		}
//		for(int i = 0; i<2; i++) {
//			System.out.printf("array["+i+"]="+array[i]+"\t\t");
//		}
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++) {
			System.out.print(i+"번째 학생의 이름 :");
			array[i].name = sc.nextLine();
			System.out.print(i+"번째 학생의 나이 :");
			array[i].age = sc.nextInt();
			sc.nextLine();
		}
		for(int i = 0; i<2;i++) {
			System.out.print("array["+i+"]의 이름 :" + array[i].name+"\t");
			System.out.println("array["+i+"]의 나이 :" + array[i].age);
		}
	}
}

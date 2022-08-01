
public class ArrayDemo {
	public static void main(String[] args) {
//		int [] array; // 배열의 선언
//		array = new int[4];
//		array[0] = 6;
//		array[1] = 9;
//		array[2] = 12;
//		array[3] = 15;
//		for(int i = 0 ; i < 4; i++) {
//			System.out.print("array["+i+"]"+array[i]+"\t");
//		}
//		double []weight;
//		weight = new double[] {13.9,81.3,60.0,50.3,13.5};
//		for(int i = 0; i<5;i++) {
//			System.out.printf("weights[%d] = %2.1f\t",i,weight[i]);
//		}
		
		char [] grades = {'A','C','B','B','C'};
		for(int i=0; i<5;i++) {
			System.out.printf("grade[%d] = %c",i,grades[i]);
			System.out.println();
		}
		
		
	}
}

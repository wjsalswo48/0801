
public class ArrayDemo3 {
	public static void main(String [] args) {
		int []array = new int[4];
		for(int i = 0; i<array.length;i++) {
			System.out.print("array["+i+"]="+array[i]+"\t");
		}
		System.out.println();
		
		double [] array1 = new double[4];
		for(int i = 0; i<array1.length;i++) {
			System.out.print("array["+i+"]="+array1[i]+"\t");
		}
		System.out.println();
		//문자형
		// 널값 -> 아스키코드 : '\0' 유니코드 : '\u0000' 
		char [] array2 = new char[4];
		for(int i = 0; i<array2.length;i++) {
			System.out.print("array["+i+"]="+array2[i]+"\t");
		}
		System.out.println();
		boolean [] array3 = new boolean[4];
		for(int i = 0; i<array3.length;i++) {
			System.out.print("array["+i+"]="+array3[i]+"\t");
		}
		
		System.out.println();
		String [] array4 = new String[4];
		for(int i = 0; i<array4.length;i++) {
			System.out.print("array["+i+"]="+array4[i]+"\t");
		}
		
	}
}

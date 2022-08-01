
public class ArrayDemo5 {
	public static void main(String[] args) {
		int [] array = {4,5,8,1,3};
//		for(int i =0; i<array.length; i++) {
//			System.out.println("array["+i+"]="+array[i]);
//		}
		int num = 0;
		for(int su:array) {
			num+=su;
			System.out.println(su);
		}
		System.out.println(num);
	}
}

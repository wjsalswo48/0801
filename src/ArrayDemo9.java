
public class ArrayDemo9 {
	public static void main(String[] args) {
//		double [] original = {78.2,56.9,43.5};
//		double [] target = {172.8, 185.4, 162.9, 152.1};
//		
//		target[0] = original[1];//값복사
//		target = original;//주소복사
//		
//		int original = 5;
//		int target = 9;
//		int temp=original;
//		System.out.println("Before : original : "+ original+", target :"+target);
//		original = target;
//		target = temp;
//		System.out.println("After : original : "+ original+", target :"+target);
		
//		Product pencil = new Product();
//		pencil.name = "연필"; pencil.price = 200; pencil.color = "Black";
//		
//		Product mouse = new Product();
//		mouse.name = "마우스"; mouse.price = 50000; mouse.color = "Silver";
//		
//		System.out.println("Befor Swapping");
//		pencil.display();
//		mouse.display();
//		
//		Product temp = pencil;
//		pencil = mouse;
//		mouse = temp;
//		
//		System.out.println("After Swapping");
//		pencil.display();
//		mouse.display();
		
		
		int [] original = {4,6,2,3,5,2,5,1,6,8,9,3,2};
		System.out.println("Before Sorting");
		for(int su : original) {
			System.out.printf("%d\t",su);
		}
		for(int i = 0; i<original.length-1;i++) {
			for(int j = i+1;j<original.length;j++) {
				if(original[i]>original[j]) {
					int temp = original[j];
					original[j]=original[i];
					original[i]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("After Sorting");
		for(int i = 0 ; i < original.length; i++) {
			System.out.print(original[i]+"\t");
		}
	}
}

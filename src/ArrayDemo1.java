
public class ArrayDemo1 {
	public static void main(String[] args) {
		Student [] array;
		array = new Student[3];
		
		array[0] = new Student();
		array[0].name = "chulsu";
		array[0].age=27;
		
		array[1] = new Student();
		array[1].name = "jimin";
		array[1].age=26;
		
		array[2] = new Student();
		array[2].name = "짱구";
		array[2].age=8;
		int sum = 0;
		for(int i = 0; i<3;i++) {
			System.out.println(array[i].name+", "+array[i].age);
			sum+=array[i].age;
		}
		System.out.println("평균나이는 : "+sum/3);
	}
}

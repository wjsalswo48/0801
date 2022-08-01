
public class Practice4 {
	public static void main(String[] args) {
		int [] arr = {10, 50, 44, 56, 29, 30, 9, 48, 84, 92};
		int sum = 0;
		double avg = 0.0;
		int min = 0;
		int max = 0;
		int len = arr.length;
		System.out.print("배열 원본 = ");
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i!=arr.length-1)
				System.out.print(", ");
			sum += arr[i];
		}
		avg =(double)sum/len;
		System.out.println();
		System.out.print("내림차순 = ");
		for(int i = 0; i<arr.length;i++) {
			for(int j = i+1; j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			System.out.print(arr[i]);
			if(i!=arr.length-1)
				System.out.print(", ");
		}
		min = arr[len-1];
		max = arr[0];
		
		System.out.println();
		System.out.print("올림차순 = ");
		for(int i = 0; i<arr.length;i++) {
			for(int j = i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			System.out.print(arr[i]);
			if(i!=arr.length-1)
				System.out.print(", ");
		}
		System.out.println();
		System.out.println("합계 = "+sum);
		System.out.println("평균 = "+avg);
		System.out.println("최대값 = "+max);
		System.out.println("최소값 = "+min);
	}
}

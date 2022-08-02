//1부터 100까지 소수를 출력하기
public class Practice6 {
	public static void main(String[] args) {
		boolean flag = true;
		int i,j,count=0;
		for(i =2;i<100; i++) {
			for(j=2;j<i;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			flag = true;
			if(flag && i==j) {
				System.out.printf("%d\t",i);
				count++;
				if(count%5==0)System.out.println();
			}
		}
	}
}

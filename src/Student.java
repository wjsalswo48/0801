
public class Student {

	String name,hakbun;
	int kor,eng,mat,tot,age;
	double avg;
	char grade;
	
	void calcTot(){
		tot = kor + eng + mat;
	}
	void calcAvg(){
		avg = tot/3.;
	}
	void calcGrade(){
		grade = (90<=avg &&avg<=100 )?'A':
			(avg<=90)?'B':
				(avg<=80)?'C':
				(avg<=70)?'D':'F';
	}
	void display() {
		System.out.printf("%s(%s)\t%d\t%d\t%d\t%d\t%.2f\t%c"
				,name,hakbun,kor,eng,
				mat,tot,avg,grade);
	}
}

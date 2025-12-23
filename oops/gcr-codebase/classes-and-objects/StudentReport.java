package oops;

public class StudentReport {
	String name;
	String rollNumber;
	double []marks;
	StudentReport(String name,String rollNumber,double[]marks){
		this.name=name;
		this.rollNumber=rollNumber;
		this.marks=marks;
	}
	public String calculateGrade(double[]marks) {
		double totalSum=totalMarks(marks);
		if(totalSum>=80&&totalSum<=100)return "Grade A";
		else if(totalSum>=60 &&totalSum<80)return"Grade B";
		else if(totalSum>=50 &&totalSum<60)return"Grade C";
		else if(totalSum>=40 &&totalSum<50)return"Grade D";
		else {
			return "Grade F";
		}
	}
	public double totalMarks(double[]marks) {
		double sum=0;
		for(int i=0;i<marks.length;i++) {
			sum+=marks[i];
		}
		return sum;
	}
	public void display() {
		System.out.println("Student's Name: "+name);
		System.out.println("Student's Roll Number: "+rollNumber);
		System.out.println("Student's Marks");
		for(int i=0;i<marks.length;i++) {
			System.out.println("Mark"+(i+1)+": "+marks[i]);
		}
		System.out.println(calculateGrade(marks));
		System.out.println("-----------------------------");
	}
	public static void main(String[] args) {
		double[]marks1= {78,96,82};
		double[]marks2= {80,90,72};
		StudentReport str1=new StudentReport("Anurag", "2215100004", marks1);
		str1.display();
		
		
	}
}

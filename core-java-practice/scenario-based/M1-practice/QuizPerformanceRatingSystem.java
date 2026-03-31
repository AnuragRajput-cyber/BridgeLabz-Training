package m1.practice;

import java.util.*;

class StudentRecord {
	String studentName;
	String department;
	int quiz1;
	int quiz2;
	int quiz3;

	public StudentRecord(String studentName, String department, int quiz1, int quiz2, int quiz3) {
		super();
		this.studentName = studentName;
		this.department = department;
		this.quiz1 = quiz1;
		this.quiz2 = quiz2;
		this.quiz3 = quiz3;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getQuiz1() {
		return quiz1;
	}

	public void setQuiz1(int quiz1) {
		this.quiz1 = quiz1;
	}

	public int getQuiz2() {
		return quiz2;
	}

	public void setQuiz2(int quiz2) {
		this.quiz2 = quiz2;
	}

	public int getQuiz3() {
		return quiz3;
	}

	public void setQuiz3(int quiz3) {
		this.quiz3 = quiz3;
	}

	public int getTotalScore() {
		return quiz1 + quiz2 + quiz3;
	}

	@Override
	public String toString() {
		return "StudentRecord [studentName=" + studentName + ", department=" + department + ", quiz1=" + quiz1
				+ ", quiz2=" + quiz2 + ", quiz3=" + quiz3 + "]";
	}

	public int getQuiz(String QuizName) {
		if (QuizName.equalsIgnoreCase("Q1")) {
			return getQuiz1();
		} else if (QuizName.equalsIgnoreCase("Q2")) {
			return getQuiz2();
		} else {
			return getQuiz3();
		}
	}

}

public class QuizPerformanceRatingSystem {
	static List<StudentRecord> records = new ArrayList<>();

	public static void record(String studentName, String departmentName, int quiz1, int quiz2, int quiz3) {
		records.add(new StudentRecord(studentName, departmentName, quiz1, quiz2, quiz3));
		System.out.println("Record added: "+studentName);
	}

	public static void topByDepartment(String departmentName) {
		if(records.isEmpty()) {
			System.out.println("records not available");
			return;
		}
		List<StudentRecord>studentsDepart=records.stream().filter(k->k.getDepartment().equalsIgnoreCase(departmentName)).toList();
		if(studentsDepart.isEmpty()) {
			System.out.println("Department not fonund");
		}
		int max=studentsDepart.stream().mapToInt(StudentRecord::getTotalScore).max().getAsInt();
		
		for(StudentRecord s:records) {
			if(s.getDepartment().equalsIgnoreCase(departmentName)&& s.getTotalScore()==max) {
				System.out.println(s.getStudentName()+" "+s.getTotalScore());
			}
		}
	}

	public static void topByQuizName(String quizName) {
		if(records.isEmpty()) {
			System.out.println("Records not available");
		}
		int max=Integer.MIN_VALUE;
		for(StudentRecord s:records) {
			max=Math.max(max, s.getQuiz(quizName));
		}
		
		for(StudentRecord s:records) {
			if(s.getQuiz(quizName)==max) {
				System.out.println(s.getStudentName()+" "+max);
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		while(n-->0) {
			String input=sc.nextLine();
			String[]inp=input.split("\\s+");
			String command=inp[0];
			if(command.equalsIgnoreCase("record")) {
				record(inp[1],inp[2],Integer.parseInt(inp[3]),Integer.parseInt(inp[4]),Integer.parseInt(inp[5]));
			}
			else if(command.equalsIgnoreCase("Top")) {
				if(inp[1].startsWith("Q")) {
					topByQuizName(inp[1]);
				}else{
					topByDepartment(inp[1]);
				}
			}
		}
		
	}
}

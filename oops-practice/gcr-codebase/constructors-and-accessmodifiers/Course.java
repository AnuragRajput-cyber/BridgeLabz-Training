package oops.constructors_and_accessmodifiers;

public class Course{
	
    //Instance variables
	
    private String courseName;
    private int duration;
    private double fee;

    //Class variable
    private static String instituteName;

    public Course(String courseName,int duration,double fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }

    public void displayCourseDetails(){
        System.out.println("Course Name: "+courseName);
        System.out.println("Duration: "+duration + " months");
        System.out.println("Fee: " +fee +" INR");
        System.out.println("Institute Name: "+instituteName);
    }

    public static void updateInstituteName(String newInstituteName){
        instituteName = newInstituteName;
    }

    public static void main(String[] args){
        Course.updateInstituteName("Gla University");
        Course course1=new Course("Java Programming",2,600);
        Course course2= new Course("Spring",3, 500);

        course1.displayCourseDetails();
        System.out.println();
	course2.displayCourseDetails();
        System.out.println("\nUpdating Institute Name...\n");
        Course.updateInstituteName("Advanced Tech Institute");
		
        course1.displayCourseDetails();
        System.out.println();
        
	course2.displayCourseDetails();
    }
}

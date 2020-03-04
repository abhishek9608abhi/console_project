package student.admission;
import java.util.Scanner;
public abstract class Courses 
{
	Scanner scan = new Scanner(System.in);

	//course variables
	private String course_name;
	private int course_id;
	private int course_fees;

	 //to check the status of course weather it is created or not
	 public boolean course_status = false;

	Courses() 
	{
		
	}

	// setting all details of course
	public void setCourse() 
	{
		System.out.println("Enter Course name");
		String course_name = scan.nextLine();
		System.out.println("Enter Course id");
		int course_id = scan.nextInt();
		System.out.println("Enter Course fees");
		int course_fees = scan.nextInt();

		this.course_id = course_id;
		if(course_name=="UC1"||course_name=="UC2"||course_name=="UC3")
			this.course_name = course_name;
		this.course_fees = course_fees;

		System.out.println("Course is added");
	}

	//getter for course details
	protected String getCourse_name() {
		return course_name;
	}

	protected int getCourse_id() {
		return course_id;
	}

	protected int getCourse_fees() {
		return course_fees;
	}

}

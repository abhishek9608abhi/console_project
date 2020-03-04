package student.admission;
import java.util.Scanner;
public class Counselor
{
	Scanner scan = new Scanner(System.in);
	public String counselor_name = "Imran";
	
	//when counselor will give admission this method will call
	  int giveAdmission(Student student)
	  {
		 System.out.println("Your details:");
		
		 //student have to show their details for admission
		 student.showDetails();
		
		 System.out.println();
		 System.out.println("1: Confirm");
		
		 int confirm = scan.nextInt();
		 //returning abc id
		
		 if(confirm==1)
			return 2001;
		 else
			return 0;
	  }
	
	 //course will show with this method
	 void showCourses(Admin admin) 
	 {
		
		 //this condition will check their is any course in institute
	     if(admin.course_status) 
	     {
		 	System.out.println("Our course is: ");
			
			//admin will show course
		 	admin.checkCourseDetails();
		  }
	      else 
	      {
			System.out.println("No course available for now");
			System.exit(0);
		  }
	}
}

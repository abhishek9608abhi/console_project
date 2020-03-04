package student.admission;
import java.util.Scanner;
public class Admin extends Courses
{
    Scanner scan = new Scanner(System.in);
	
	final private int admin_id = 1234;
	final private int admin_password = 1234;
	
	Admin() 
	{
		
		//taking authentication of admin
		System.out.println("Enter admin id:");
		int admin_id = scan.nextInt();
		System.out.println("Enter admin password:");
		int admin_password = scan.nextInt();
		
		//if admin give invalid values
		if(this.admin_id != admin_id && this.admin_password != admin_password) 
		{
			System.out.println("Wrong id program terminate");
			System.exit(0);
		}
	}
	
	 // all task of admin will come in this method
	 String adminTask()
	 {
		
		//showing options to admin
		System.out.println("------------------");
		System.out.println("Select options:");
		System.out.println("1: Set Course");
		System.out.println("2: Get Students Details");
		
		int check_input = scan.nextInt();
		
		//according to choice block will execute
		if(check_input == 1) 
		{
			
			//inherited method for setting course details
			setCourse();
			
			//now course is add so status will be true now
			this.course_status = true;
			
			//return block detail which is executed
			return "Course";
		}
		else if(check_input == 2) 
		{
			System.out.println("No student data");
			return "Student";
		}
		else 
		{
			System.out.println("Invalid input");
			return "Invalid";
		}
	 }
	
	 //getter for seeing course
	 void checkCourseDetails() 
	 {
		
		System.out.println();
		
		//inherited from course class
		System.out.println(getCourse_id());
		System.out.println(getCourse_name());
		System.out.println(getCourse_fees());
  	 }
}

    //manager class will have all methods of admin it will make code compact
   class Manager 
   {
	
	Scanner scan = new Scanner(System.in);
	
	 void managerAdministration(Admin admin) 
	 {
		
		//whatever task is done by admin will take in check_task variable
		String check_task = admin.adminTask();
		
		//according to task block will execute
		 if(check_task == "Course") 
		 {
			System.out.println("------------------");
			
			System.out.println("Do you want see course");
			System.out.println("1: Yes 2: No");
			
			int see = scan.nextInt();
			
			if(see == 1)
				admin.checkCourseDetails();
		 }
	  }
   }

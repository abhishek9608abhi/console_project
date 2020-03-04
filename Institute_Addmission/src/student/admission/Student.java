package student.admission;
import java.util.Scanner; 
public class Student 
{
	    //student details
		private String student_name;
		private String college_name;
		private long mobile_number;
		
		Scanner scan = new Scanner(System.in);
		
		//zero parameterized constructor call
		Student() 
		{
			
			//setting student name
			System.out.println("Enter Student name");
			String student_name = scan.nextLine();
			setStudent_name(student_name);
			
			//setting student college name
			System.out.println("Enter College name");
			String college_name = scan.nextLine();
			setCollege_name(college_name);
			
			//setting student contact number
			System.out.println("Enter Mobile number");
			long mobile_number = scan.nextLong();
			setMobile_number(mobile_number);
			
			System.out.println("Details successfully added");
		}
		
		//parameterized constructor call
		Student(String student_name, String college_name, long mobile_number) 
		{
			
			//setting student name
			setStudent_name(student_name);
			
			//setting student college name
			setCollege_name(college_name);
			
			//setting student contact number
			setMobile_number(mobile_number);
		}

		//setter for student name
		private void setStudent_name(String student_name)
		{
			this.student_name = student_name;
		}

		//setter for college name
		private void setCollege_name(String college_name) 
		{
			this.college_name = college_name;
		}
		
		//setter for mobile number
		private void setMobile_number(long mobile_number) 
		{
			this.mobile_number = mobile_number;
		}

		//showing all details of student
		public void showDetails() 
		{
			System.out.println("Student name: "+student_name);
			System.out.println("College name: "+college_name);
			System.out.println("Contact number: "+mobile_number);
		}
		
		//when student visit to institute visit method will call
		void visit(Counselor counselor, Admin admin) 
		{
			System.out.println("Your counselor is "+counselor.counselor_name);
			
			//counselor will show all course which institute have
			counselor.showCourses(admin);
		}
		
		//if student wants to take admission then take admission method will call
		int takeAdmission(Counselor counselor, Student student) 
		{
			
			//counselor will now give admission to student
			return counselor.giveAdmission(student);
		}
	}

	//Visitor have all student methods it will make code compact
	class Visitor 
	{
		
		Scanner scan = new Scanner(System.in);
		
		//visit and takeadmission student class method will come in visitor mewthod
		void visitStudent(Student student,Admin admin, Counselor counselor) 
		{
			
			System.out.println("------------------");
			
			
			//visit method call
			student.visit(counselor, admin);
			
			System.out.println();
			
			//asking student for admission
			System.out.println("Do you want to take admission");
			System.out.println("1: Yes 2: No");
			
			int take = scan.nextInt();
			
			System.out.println("--------------------------");
			
			//if student wants to take admission
			if(take == 1) 
			{
				
				//takeadmission method it will return abc id if admission is successfull
				int abc_id = student.takeAdmission(counselor, student);
				System.out.println();
				if(abc_id!=0)
					System.out.println("Your ABC id is "+abc_id);
				else
					System.out.println("Details error plzz visit again thanku");
			}
		}
}

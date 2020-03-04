package student.admission;
import java.util.Scanner;
public class Institute {

	public static void main(String[] args) 
	{
        Scanner scan = new Scanner(System.in);
		
		//welcome statement
		System.out.println("----------Welcome to ABC Institute----------");
		
		//admin is created
		System.out.println("Welcome Admin");
		Admin admin = new Admin();
		
		//manager is created
		Manager manager = new Manager();
		manager.managerAdministration(admin);
		
		//counselor is created
		Counselor counselor = new Counselor();
		
		
		//student is created
		System.out.println("----------Welcome Student----------");
		Student student = new Student();
	
		//visitor is created
		Visitor visitor = new Visitor();
		visitor.visitStudent(student, admin, counselor);
		
		
		scan.close();
		
		System.out.println("-------------------------");
		
		//last statement
		System.out.println("Thanks for visit");


	}

}

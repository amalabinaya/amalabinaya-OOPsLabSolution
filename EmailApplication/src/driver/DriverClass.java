package driver;

import model.Department;
import model.Employee;
import service.CredentialService;

import java.util.Scanner;


public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee= new Employee("amal","abinaya");
		System.out.println("Enter Department Name");
		System.out.println("1.Technical\n2.Legal\n3.HR\n4.Management");
		Scanner in=new Scanner(System.in);
		int choice = in.nextInt();
		Department department = new Department();
		CredentialService cr = new CredentialService();
		switch(choice) {
		case 1:
			department.setDeptName("technical");
			String email = cr.generateEmail(employee, department);
			String password = cr.generatePassword();
			cr.showCredentials(email, password);
			break;
		case 2:
			department.setDeptName("legal");
			email = cr.generateEmail(employee, department);
			password = cr.generatePassword();
			cr.showCredentials(email, password);
			break;

		case 3:
			department.setDeptName("hr");
			email = cr.generateEmail(employee, department);
			password = cr.generatePassword();
			cr.showCredentials(email, password);
			break;

		case 4:
			department.setDeptName("management");
			email = cr.generateEmail(employee, department);
			password = cr.generatePassword();
			cr.showCredentials(email, password);
			break;

		
		}
	}
}


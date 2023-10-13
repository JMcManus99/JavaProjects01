package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int uniYear;
	private String studentID;
	private String courses;
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//Constructor prompts users name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name:  ");
		this.lastName = in.nextLine();
		
		System.out.print("1- First Year \n2- Second Year\n3- Placement\n4- Final Year\nEnter student year: ");
		this.uniYear = in.nextInt();
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + uniYear + " " + studentID);
	}
	//Generate an ID
	private void setStudentID() {
		//uni year + id
		id++;
		this.studentID = uniYear + "" + id;
		
		
	}
	
	//enrol in courses
	
	//view balance
	
	//pay tuition
	
	//show status
	
}

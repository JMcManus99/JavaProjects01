package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int uniYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// Constructor prompts users name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();

		System.out.print("Enter student last name:  ");
		this.lastName = in.nextLine();

		System.out.print("1- First Year \n2- Second Year\n3- Placement\n4- Final Year\nEnter student year: ");
		this.uniYear = in.nextInt();

		setStudentID();

	}

	// Generate an ID
	private void setStudentID() {
		// uni year + id
		id++;
		this.studentID = uniYear + "" + id;

	}

	// enrol in courses
	public void enroll() {
		// Get inside a loop, user hits 0 when done enrolling
		do {
			System.out.print("Enter a course to enroll (Q to quit):");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				break;
			}
		} while (1 != 0);

	}

	// view balance
	public void viewBalance() {
		System.out.println("Your balance is £" + tuitionBalance);
	}

	// pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: £");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of £" + payment);
		viewBalance();
	}

	// show status
	public String toString() {
		return "Name: " + firstName + lastName + "\nStudent ID: " + studentID + "\nYear: " + uniYear
				+ "\n  Courses Enrolled: " + courses + "\nBalance: £" + tuitionBalance;
	}

}

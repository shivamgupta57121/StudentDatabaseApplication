package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradYear;
	private String studentID;
	private String courses="";
	private int tutionBalance = 5000;
	private static int costOfCourse = 5000;
	private static int id = 1000;
	

	// Constructor: propmpts user to enter name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name : ");
		this.firstName = in.next();
		
		System.out.print("Enter student last name : ");
		this.lastName = in.next();
		
		System.out.print("Year \n1 - Fresher\n2 - Second\n3 - Pre-final\n4 - Final\nEnter student year : ");
		this.gradYear = in.nextInt();
		
		setStudentID();
		
	}
	
	// Generate an ID
	private void setStudentID() {
		id++;
		// Grade level + ID
		this.studentID = gradYear + "" +id;
		
	}
	
	
	//Enroll in courses
	public void enroll( ) {
		// Get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tutionBalance += costOfCourse ;
			}
			else break;
		}while(1!=0);
	}
	
	//View Balance
	public void viewBalance() {
		System.out.println("Your balance is: Rs"+tutionBalance);
	}
	
	//Pay Tution Fees
	public void payTution() {
		Scanner in =new Scanner(System.in);
		viewBalance();
		System.out.print("Enter your payments Rs");
		int payment = in.nextInt();
		if(payment<=tutionBalance && payment>0) {
			tutionBalance -= payment;
			System.out.println("Thank you for your payment of Rs"+payment);
			viewBalance();
		}
		else System.out.println("Wrong Fee Payment!! ");
	}
	
	//Show Status
	// toString is used . It is part of Object class . And we actually override that
	public String toString() {
		return "Name: "+ firstName + " " + lastName +
				"\nYear: " +gradYear +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + courses +
				"\nBalance: Rs" + tutionBalance;
	}
	
	
}

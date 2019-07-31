package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		// Ask how many new users we want to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		//Create n number of new students
		for(int n=0;n<numOfStudents;n++) {
			int n1=n+1;
			System.out.println("Enter the details of student: "+ n1);
			students[n] = new Student();
			students[n].enroll();
			students[n].payTution();
		}
		for(int n=0;n<numOfStudents;n++) {
			System.out.println(students[n].toString());
		}
		
	}

}

package SchoolProject;

import java.util.Scanner;

public class _SchoolProject {
	public static void main(String[] args) {
		/*
		 *  Write a java program for school management 
		 *  
		 *  - object creation
		 *  - inheritence
		 *  - polymorphisim overloadin and overriding
		 *  - encapsulation
		 *  
		 *  Program should includes
		 *  
		 *  1) Constant Data class;
		 *     * there should be some data about school, like name, web address, phone number, address etc
		 *     * Information could not be changeable
		 *  2) Teacher class
		 *     * there should be some information about all teachers like name, surname,branch and phone number
		 *     * there should be constructors to create teacher objects
		 *     * there should be a method for printing teacher's information
		 *  3) Teachers class
		 *     * there should be a list to store all teachers
		 *     * there should be a method to add teachers to teachers list
		 *     * there should be a method to print all teachers
		 *     * there should be a method to print numbers of teachers 
		 *  4) Course class
		 *     * there should be course id, season, name, cost variables
		 *     * there should be constructors to create course objects
		 *     * there should be a method for printing course information
		 *  5) Courses class
		 *     * there should be a list to store all courses
		 *     * there should be a method to add courses to courses list
		 *     * there should be a method to print all courses
		 *     * there should be a method to print numbers of courses
		 *  6) Let's make our project interactive
		 *     Print a menu and do what users want 
		 *     
		 * 		1- wellcoming message
		 * 		2- print menu
		 *		    1- School Informations
		 *    		2- Teachers List
		 *    		3- Courses List
		 *      
		 *     
		 *  7) Student class
		 *     * there should be some information about all students like id, name, surname
		 *     * there should be a map to store all students
		 *     * there should be a method for taking data from user and to create new students
		 *     * there should be a method that accepts student's id from user as parameter and prints student's information
		 *     * there should be a method that accepts student's id from user as parameter and deletes student from map
		 *     * there should be a method for printing all students
		 *     
		 *     * add to menu
		 *     		4-Create new student
		 *    		5-Print All Students 
		 *	  		6-Show student's information with id 
		 *    		7-Delete student by id
		 *     
		 *      
		 */
		
		
		// =============== creating teachers==============
		TeacherClass teacher01 = new TeacherClass();
		teacher01.setName("Suleyman");
		teacher01.setSurname("Alptekin");
		teacher01.setBranch("Java");
		teacher01.setPhoneNumber("5553625147");
		TeacherClass teacher02 = new TeacherClass("Ahmet" , "Bayram" , "Selenium" , "5555685478");
		
		// =================creating teachers object and add teachers to the list=========
		
		TeachersClass teachers = new TeachersClass();

		teachers.addTeacherToList(teacher01);
		teachers.addTeacherToList(teacher02);
		

		

		//========= creating Courses from course class=========");
		
		CourseClass course101 = new CourseClass(101,"QA" , "Summer", 800);
		CourseClass course102 = new CourseClass(102,"Web Developer" , "Summer", 900);
		CourseClass course103 = new CourseClass(103,"Java Developer" , "Summer", 1000);
		CourseClass course104 = new CourseClass(104,"DevOps" , "Summer", 1100);

		
		//========Creating corses object from  Courses Class and add courses to list========");
		
		CoursesClass courses = new CoursesClass();
		courses.addCourseToList(course101);
		courses.addCourseToList(course102);
		courses.addCourseToList(course103);
		courses.addCourseToList(course104);
		
		// ======beginnig of interactive program====
		
		int choise =1;
		
		
		do {
		Scanner scan = new Scanner(System.in);
		System.out.println("==================== ");
		System.out.println(" Welcome to Techproed "
				+ "\n please select from menu "
				+ "\n 1- School Information "
				+ "\n 2- Teachers List "
				+ "\n 3- Courses List "
				+ "\n please enter 0 for Quit");
		
		choise = scan.nextInt();
		
		
		switch (choise) {
		
		case 1 : 
			schollInformation();
			break;
		case 2 : 
			
			teachers.printTeachers();
			break;
		case 3:
			courses.printCourses();
			break;
		}
		} while (choise != 0);

		
		
	}
	
	public static void schollInformation() {
		System.out.println("===== SCHOOL INFORMATION======");
		System.out.println("Name : " + ConstantData.NAME);
		System.out.println("Web Address : " + ConstantData.WEB_ADDRESS);
		System.out.println("Phone Number : " + ConstantData.PHONE_NUMBER);
		System.out.println("address : " + ConstantData.ADDRESS);
		
	}
	   
}

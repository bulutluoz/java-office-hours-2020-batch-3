package SchoolProject;

import java.util.ArrayList;
import java.util.List;

public class CoursesClass {
	 /*  5) Courses class
	 *     * there should be a list to store all courses
	 *     * there should be a method to add courses to courses list
	 *     * there should be a method to print all courses
	 *     * there should be a method to print numbers of courses
	 *     */
	
	List<CourseClass > coursesList= new ArrayList<CourseClass>();
	
	public void addCourseToList(CourseClass course) {
		coursesList.add(course);
	}
	
	public void printCourses() {
		
		System.out.println("====courses list from courses class====");
		for(CourseClass w : coursesList) {
			System.out.println(w.toString(w));
		}
		
	}
	
	public int numbersOfCourses() {
		
		return coursesList.size();
	}

}

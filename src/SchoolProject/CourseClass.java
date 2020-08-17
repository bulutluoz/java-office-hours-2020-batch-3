package SchoolProject;

public class CourseClass {

	/*
	 * * 4) Course class 
	 *      * there should be course id, season, courseName, cost variables 
	 *      * there should be constructors to create course objects 
	 *      * there should be a method for printing course information
	 * 
	 */
	
	
	private String season,courseName;
	private int id,cost;
	
	CourseClass (int id, String courseName,String season, int cost){
		this.id=id;
		this.season=season;
		this.courseName=courseName;
		this.cost=cost;
	}
	CourseClass(){
		
	}
	
	public String toString(CourseClass course) {
		
		return "Course Id " + id + " Course Name: " + courseName  + ", " + "Course Season: " + season + ", " + "$"+cost;
	}
	
}

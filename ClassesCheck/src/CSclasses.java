import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class CSclasses {

	public static void main (String[] args) {
		// DATA MEMBERS
		Scanner input = new Scanner (System.in);
		Course course;
		List<Course> csList = new ArrayList<>();
		
//		String csNum;	// Course Number
//		String rmNo;	// In-class Room Number
//		int stNum;		// Registered number of Student counts
//		int maxStNum;	// Max. number of Student per Course
		
		String csemail;	// Course Contact email
		String webInfo;	// Course Web

		
		// public Course(String couseNum, int maxStudents, int students, double credits)
		webInfo = "https://CSD2L/D2L/CSC/zoom";
		csemail = "test.test@frontrange.edu";
		
		course = new InPersonClasses ("CSC1019", 20, 15, 3.0, "BP116");
		csList.add (course);
//		System.out.println(course.toString());

		course = new InPersonClasses ("CSC1060", 20, 14, 4.0, "BP116");
		csList.add (course);
//		System.out.println(course);

		course = new FullRemoteOnline ("CSC1019", 25, 5, 3.0, csemail);
		csList.add (course);
//		System.out.println(course);
		
		course = new RealTimeRemoteClass ("CSC1019", 25, 5, 3.0, webInfo);
		csList.add (course);
//		System.out.println(course);
//		System.out.println(course.toString());
		
//		System.out.println(csList);
//		System.out.println("\n" + csList.toString());

		printCourse (csList);
		
		// call printCourse (Course course) method
		for (int i = 0; i < csList.size(); i++) {
			printCourse(csList.get(i));
		}	
	}
	
	public static void printCourse (List<Course> csList) {
		System.out.println(csList + "from List<Course> method\n\n");
		
//		for (int i = 0; i < csList.size(); i++) {
//			System.out.println(csList.get(i).toString());
//		}
	}
	
//	public static void printCourse (Course course) {
//		System.out.println(course);
//	}
	
	public static void printCourse (Course course) {
		System.out.println("Course No. : " + course.getCourseNum()
			+ "\nMax No. Students : " + course.getMaxStudents()
			+ " / No. of Students : " + course.getStudents()
			+ "\nCredit No. : " + course.getCredits());
		if (course instanceof InPersonClasses == true) {
			System.out.println("Room No. : " + ((InPersonClasses)course).getRoomNo() + "\n");
		}
		
		if (course instanceof RealTimeRemoteClass == true) {
			System.out.println("zoom link : " + ((RealTimeRemoteClass)course).getWebLink() + "\n");
		}
		if (course instanceof FullRemoteOnline == true) {
			System.out.println("Contact email : " + ((FullRemoteOnline)course).getCsemail() + "\n");
		}
	}
		
//	
//		System.out.println(csList.getCourseNum());


}

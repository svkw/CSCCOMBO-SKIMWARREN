
public class Course {
	// DATA MEMBER
	private String courseNum;
	private int maxStudents;
	private int numStudents;
	private double credits;

	// CONSTRUCTORS
	public Course() {
		super();
	}

	public Course(String courseNum, int maxStudents, int numStudents, double credits) {
		super();
		this.courseNum = courseNum;
		this.maxStudents = maxStudents;
		this.numStudents = numStudents;
		this.credits = credits;
	}

	public String getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}

	public int getStudents() {
		return numStudents;
	}

	public void setStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "Course Name : " + courseNum
				+ "\nMAX Number of Students : " + maxStudents
				+  " / Number of Students :" + numStudents 
				+ "\nCredits :" + credits;
	}
}

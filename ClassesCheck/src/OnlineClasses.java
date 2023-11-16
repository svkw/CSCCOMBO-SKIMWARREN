import java.util.ArrayList;

import java.util.Objects;
//this one needs to be checked

public class OnlineClasses extends Course {
	private String classNum;
	private ArrayList<Course> course;
	
	public OnlineClasses() {
		super();
	}

	public OnlineClasses(String classNum) {
		super();
		this.classNum = classNum;
	}

	public OnlineClasses(ArrayList<Course> course) {
		super();
		this.course = course;
	}

	public OnlineClasses(String classNum, ArrayList<Course> course) {
		super();
		this.classNum = classNum;
		this.course = course;
	}
	
	// GETTERS & SETTERS
	public String getClassNum() {
		return classNum;
	}

	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}

	public ArrayList<Course> getCourse() {
		return course;
	}

	public void setCourse(ArrayList<Course> course) {
		this.course = course;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OnlineClasses other = (OnlineClasses) obj;
		return Objects.equals(classNum, other.classNum);
	}

	@Override
	public String toString() {
		return getClass() + super.toString() + "\n";
	}
	
}


public class InPersonClasses extends Course {
	// DATA MEMBER
	private String rmNo;

	public InPersonClasses () {
		super ();
	}
		
	public InPersonClasses (String courseNum, int maxStudents, int numStudents, double credits, String rmNo) {
		super (courseNum, maxStudents, numStudents, credits);
		this.rmNo = rmNo;
	}

	public String getRoomNo () {
		return rmNo;
	}

	public void setRoomNo (String rmNo) {
		this.rmNo = rmNo;
	}

	@Override
	public String toString () {
//		return "InPersonClasses room number : " + rmNo + ", getClass()=" 
//				+ getClass() + ", hashCode()=" + hashCode()
//				+ ", toString()=" + super.toString() + "]";
		return getClass() + "Course Name : " + super.toString() + ", Room No. : " + rmNo + "\n";
	}

		

}

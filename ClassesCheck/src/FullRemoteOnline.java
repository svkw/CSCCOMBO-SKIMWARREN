
public class FullRemoteOnline extends OnlineClass {
	private String csemail;
	
	public FullRemoteOnline() {
		super();
	}

	public FullRemoteOnline(String courseNum, int maxStudents, int numStudents, double credits, String csemail) {
		super(courseNum, maxStudents, numStudents, credits);
		this.csemail = csemail;
	}

	public String getCsemail() {
		return csemail;
	}

	public void setCsemail(String csemail) {
		this.csemail = csemail;
	}

	@Override
	public String toString() {
//		return "FullRemoteOnline [csemail=" + csemail + ", getCouseNum()=" + getCourseNum() 
//			+ ", getStudents()=" + getStudents() + ", getMaxStudents()=" + getMaxStudents() 
//			+ ", getCredits()=" + getCredits() + ", toString()=" + super.toString() 
//			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
		return getClass() + super.toString() + ", Contact email : " + csemail + "\n";
	}

}

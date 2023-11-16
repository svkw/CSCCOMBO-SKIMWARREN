
public class RealTimeRemoteClass extends OnlineClass {
	private String webLink;
	
	public RealTimeRemoteClass() {
		super();
	}
	
	public RealTimeRemoteClass(String courseNum, int maxStudents, int numStudents, double credits, String webLink) {
		super(courseNum, maxStudents, numStudents, credits);
		this.webLink = webLink;
	}

	public String getWebLink() {
		return webLink;
	}

	public void setWebLink(String webLink) {
		this.webLink = webLink;
	}

	@Override
	public String toString() {
//		return "RealTimeRemoteClass [csemail=" + csemail + ", webLink=" + webLink 
//				+ ", getCourseNum()=" + getCourseNum() 	+ ", getStudents()=" + getStudents() 
//				+ ", getMaxStudents()=" + getMaxStudents() + ", getCredits()=" 	+ getCredits() 
//				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
//				+ hashCode() + "]";
		return getClass() + super.toString() + ", Online Class link : " + webLink + "\n";
	}




	
	
}

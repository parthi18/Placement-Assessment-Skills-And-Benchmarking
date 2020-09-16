package iim.student.skills.assessment.portal.Model;

public class User {

	int userid;
	String username;
	String passwrod;
	int stafid;
	int studentid;
	
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswrod() {
		return passwrod;
	}
	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}
	public int getStafid() {
		return stafid;
	}
	public void setStafid(int stafid) {
		this.stafid = stafid;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	
	public User() {
		super();
	}
	
	public User(int userid, String username, String passwrod, int stafid, int studentid) {
		super();
		this.userid = userid;
		this.username = username;
		this.passwrod = passwrod;
		this.stafid = stafid;
		this.studentid = studentid;
	}
	
}

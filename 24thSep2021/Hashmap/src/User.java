
public class User {
	
	private String fullname;
	private String phone;
	private String height;
	private String gender;
	private boolean maritalstatus;
	public User(String fullname, String phone, String height, String gender, boolean maritalstatus) {
		super();
		this.fullname = fullname;
		this.phone = phone;
		this.height = height;
		this.gender = gender;
		this.maritalstatus = maritalstatus;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(boolean maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	
	

}

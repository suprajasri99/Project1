package POJO;

public class StudentData {
	
	private  int sid=8181;
	private  String firstName = "RamLakshman";
	private  String lastName = "Lakan";
	private  String address = "Texas";
	private int mobile = 456987;
	private  String email = "ramlakshman@gmail.com";
	
	/*public void studentDetails() {
		
			System.out.println("Student id= "+sid+ "; First Name= "+firstName+"; Last Name = "+lastName+"; Address= "+address+"; Phone = "+mobile+"; Email = "+email);	
			
	
	} */
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}

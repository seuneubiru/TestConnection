package Model;

import java.sql.Date;
//import java.text.Format;

public class Customer {
	
	private int CustomerNumber;
	private String FirstName;
	private String LastName;
	private Date BirthDate;
	private String UserName;
	private String Passwd;
	private String PhoneType;
	private String PhoneNumber;
	
	
	
	public Customer(String fName, String lName, Date tgl, String uName, String pword, String pType, String pNumber) {
		// TODO Auto-generated constructor stub
		setFirstName(fName);
		setLastName(lName);
		setBirthDate(tgl);
		setUserName(uName);
		setPasswd(pword);
		setPhoneType(pType);
		setPhoneNumber(pNumber);
	}
	

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public int getCustomerNumber() {
		return CustomerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		CustomerNumber = customerNumber;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Date getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(Date tgl) {
		BirthDate = tgl;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPasswd() {
		return Passwd;
	}
	public void setPasswd(String passwd) {
		Passwd = passwd;
	}
	public String getPhoneType() {
		return PhoneType;
	}
	public void setPhoneType(String phoneType) {
		PhoneType = phoneType;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
}

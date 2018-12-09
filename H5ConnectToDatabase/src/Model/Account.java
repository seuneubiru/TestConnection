package Model;

import java.math.BigDecimal;
import java.sql.Date;

public class Account {
	
	private int AccountNumber;
	private Date OpenDate;
	private BigDecimal Balance;
	
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public BigDecimal getBalance() {
		return Balance;
	}
	public void setBalance(BigDecimal balance) {
		Balance = balance;
	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public Date getOpenDate() {
		return OpenDate;
	}
	public void setOpenDate(Date openDate) {
		OpenDate = openDate;
	}
	
	
}

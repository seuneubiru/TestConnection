package Model;

import java.math.BigDecimal;

public class Transaction {
	
	private int id;
	private String Type;
	private BigDecimal Amount;
	private String AmountSign;
	
	
	private Account id_account;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public BigDecimal getAmount() {
		return Amount;
	}

	public void setAmount(BigDecimal amount) {
		Amount = amount;
	}

	public String getAmountSign() {
		return AmountSign;
	}

	public void setAmountSign(String amountSign) {
		AmountSign = amountSign;
	}

	public Account getId_account() {
		return id_account;
	}

	public void setId_account(Account id_account) {
		this.id_account = id_account;
	}
	
	
}

import java.sql.Date;

public class Receipt {
	private Date date; 
	private double amount; 
	private User user; 
	private int receiptId;
	private int receiptCounter;
	private SPForm spForm;
	
	public Receipt(double amount , User user , SPForm sp) {
		this.amount = amount;
		this.user = user; 
		this.spForm = sp; 
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public User getUser() {
		return this.user;
	}
	
	public boolean match(int receiptId) {
		if(this.receiptId == receiptId)
			return true;
		else
			return false; 
	}
	
	public int getReceiptId() {
		return this.receiptId; 
	}
	
}

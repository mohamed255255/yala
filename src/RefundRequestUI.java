
public class RefundRequestUI {
	private ICommand createRefundRequestCommand;
	private ICommand getReceiptCommand;
	private RefundRequest refundrequet;
	private Receipt receipt;
	private User user;  
	
	public RefundRequestUI(User user){
		this.user = user; 
	}
	public void setReceipt(Receipt r) {
		this.receipt = r;
	}
	
	public void LoadUI() {
		
	}
	
	
	
	
	
}

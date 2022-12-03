
public class RefundRequest {
	private String requestNum;
	private String reason; 
	private String status;
	private Receipt receipt;
	ICommand addToWalletBalance;
	
	public RefundRequest(String reqnum , Receipt r) {
		this.requestNum = reqnum;
		this.receipt = r; 
	}
	
	public String getreason() {
		return reason; 
	}
	public Receipt getreceipt() {
		return receipt; 
	}
	public String getstatus() {
		return status;
	}
	public boolean match(Receipt r) {
		if(receipt.match(r.getReceiptId())) {
			return true;
		}
		else {
			return false; 
		}
			
	}
	public boolean match(String reqNum ) {
		if(this.requestNum == reqNum)
			return true;
		else
			return false; 
	}
	
	
}

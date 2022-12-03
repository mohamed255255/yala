import java.util.ArrayList;

public class ReceiptDB {
	private ArrayList<Receipt> receipts = new ArrayList<Receipt>(); 
	private ReceiptDB receitdb = new ReceiptDB();
	
	private ReceiptDB() {
	}
	
	public Receipt getReceipt(int id) {
		for(Receipt i : receipts ) {
			if(i.getReceiptId() == id) {
				return i;
			}
		}
		return null ;
	}
	
	public ReceiptDB getinstance() {
		return receitdb; 
	}
	
	
	
	
}

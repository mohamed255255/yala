import java.util.ArrayList;

public class RefundRequestDB {
	private ArrayList <RefundRequest> refundrequests =new ArrayList<RefundRequest>; ; 
	private static  RefundRequestDB refundrequestdb = new RefundRequestDB(); 
	
	private RefundRequestDB() {
	}
	
	public RefundRequestDB getinstance(){
		return refundrequestdb; 
		
	}
	public void add(RefundRequest RR) {
		Receipt r = RR.getreceipt(); // return the receipt of this new refund
		
		// Before adding this request to data base 
		// check if this already exist or not , By checking receipt ID 
		
		for(RefundRequest i : refundrequests) {
			if(i.match(r)) {
				return;
			}
		}
		refundrequests.add(RR); 
		
	}
	
	public ArrayList<RefundRequest> getRefundRequests (){
		return refundrequests; 
	}
	
	public RefundRequest getRefundRequest(String req_num) {
		// Serching about RefundRequest with corresponding request number in database 
		
		for(RefundRequest i : refundrequests) {
			if(i.match(req_num)) {
				return i;
			}
		}
		
		return null ; 
	}
	
	
	
		
	
	
}

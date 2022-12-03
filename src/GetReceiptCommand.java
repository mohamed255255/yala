public class GetReceiptCommand implements ICommand{
	private RequestRefundUI requestRefundUI;
	private int receiptId;
	GetReceiptCommand(RequestRefundUI requestRefundUI, int receiptId){
		this.requestRefundUI = requestRefundUI;
		this.receiptId = receiptId;
	}
	@Override
	public void excute() {
		requestRefundUI.setReceipt(ReceiptDB.getInstance().getReceipt(receiptId));
	}
}
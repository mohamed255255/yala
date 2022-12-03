
public class CreateRefundRequestCommand implements ICommand{
	private RefundRequest refundRequest;
	CreateRefundRequestCommand(RefundRequest refundRequest){
		this.refundRequest = refundRequest;
	}
	@Override
	public void excute() {
		try {
			RefundRequestDB.getInstance().add(refundRequest);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
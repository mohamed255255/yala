
public class RequsetRefundUICommand implements ICommand{
	private User user;
	public RequsetRefundUICommand(User user) {
		this.user = user;
	}
	@Override
	public void excute() {
		RequsetRefundUI requsetRefundUI = new RequsetRefundUI(user);
	}
}
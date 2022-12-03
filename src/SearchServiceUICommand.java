
public class SearchServiceUICommand implements ICommand{
	private User user;
	public SearchServiceUICommand(User user) {
		this.user = user;
	}
	@Override
	public void excute() {
		SearchServiceUI searchServiceUI = new SearchServiceUI(user);
		searchServiceUI.loadSearchUI();
	}
}
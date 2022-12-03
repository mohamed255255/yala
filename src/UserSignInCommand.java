public class UserSignInCommand implements ICommand{
	private UserUI userUI;
	private String email;
	private String password;
	public UserSignInCommand(String email, String password) {
		this.email = email;
		this.password = password;
	}
	@Override
	public void excute() {
		try {
			userUI = new UserUI(UserDB.getInstance().getUser(email, password));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
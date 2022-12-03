public class UserSignUpCommand implements ICommand{
	private String email;
	private String password;
	public UserSignUpCommand(String email, String password) {
		this.email = email;
		this.password = password;
	}
	@Override
	public void excute() {
		try {
			UserDB.getInstance().addUser(email, password);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
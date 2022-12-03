import java.util.ArrayList;

public class UserDB {
	private ArrayList<User> users;
	private static UserDB userDB;
	private UserDB() {
		users = new ArrayList<User>();
	}
	public static UserDB getInstance() {
		if(userDB ==null) {
			userDB =new UserDB();
		}
		return userDB;
	}
	public void addUser(String email , String password ) {
		for(int i = 0 ; i < users.size() ; i++) {
			if(email.equals(users.get(i).getEmail())) {
				throw new Exception("This email is already exisits");
				return;
			}
		}
		User user = new User(email,password);
		wallet Wallet = new Wallet(user);
		wallet.balance = 0;
		users.add(user);
	}
	
	public User getUser(String email , String password) throws Exception {
		for(int i = 0 ; i < users.size() ; i++) {
			if(email.equals(users.get(i).getEmail())) {
				return users.get(i);
			}
		}
		throw new Exception("No such user");
	}
}

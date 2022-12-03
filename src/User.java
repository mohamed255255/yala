
public class User {
	private String email;
	private String password;
	private Wallet wallet;
	
	public User(String email , String password) {
		this.email = email;
		this.password=password;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public boolean match(String email , String password) {
		if(this.email == email && this.password == password) {
			return true;
		}
		else
			return false;
	}
	public String getEmail() {
		return email;
	}
	public String getPassowrd() {
		return password;
	}
	
}

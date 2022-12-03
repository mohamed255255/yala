
public class AddToWalletBalanceCommand implements ICommand{
	private Wallet wallet;
	private Double amount;
	AddToWalletBalanceCommand(Wallet wallet, Double amount){
		this.wallet = wallet;
		this.amount = amount;
	}
	@Override
	public void excute() {
		wallet.addToBalance(amount);
	}
}
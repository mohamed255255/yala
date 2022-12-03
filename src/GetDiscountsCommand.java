
public class GetDiscountsCommand implements ICommand{
	private DiscountUserUI discountUserUI;
	GetDiscountsCommand(DiscountUserUI discountUserUI){
		this.discountUserUI = discountUserUI;
	}
	@Override
	public void excute() {
		discountUserUI.setDiscounts(DiscountDB.getInstance().getDiscounts());
	}
}
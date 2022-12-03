
public class DiscountUserUICommand implements ICommand{
	@Override
	public void excute() {
		DiscountUserUI discountUI = new DiscountUserUI();
		discountUI.showDiscounts();
	}
}
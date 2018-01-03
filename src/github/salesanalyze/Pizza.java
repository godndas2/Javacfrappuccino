package github.salesanalyze;

public class Pizza implements Menu {

	public static final String NAME = "피자";
	public static final int PRICE = 13000;
	
	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public int getPrice() {
		return PRICE;
	}

}

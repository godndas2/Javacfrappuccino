package github.salesanalyze;

public class Soup implements Menu {

	public static final String NAME = "달팽이 수프";
	public static final int PRICE = 4000;
	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public int getPrice() {
		return PRICE;
	}

}

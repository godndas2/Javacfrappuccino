package github.salesanalyze;

public class Salad implements Menu {

    public static final String NAME = "샐러드";
    public static final int PRICE = 6000;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }

}

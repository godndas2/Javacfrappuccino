package github.salesanalyze;

public class Pasta implements Menu {

    public static final String NAME = "파스타";
    public static final int PRICE = 8000;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }

}

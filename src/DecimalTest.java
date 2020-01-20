import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalTest {
    public static void main(String[] args) {
//        System.out.println(new BigDecimal("2821025821.818114335971",
//                new MathContext(4,RoundingMode.HALF_UP)));
//        new DecimalFormat("###.#####").format(a)

        String v = "2821025821.818114335971";
        BigDecimal b = new BigDecimal(v);
        System.out.println(b.toString());

        String s = Double.toString(2821025821.818114335971);
        Double dd = Double.parseDouble("2821025821.818114335971");
        System.out.println(s);
        System.out.println(dd);


        final double d = 2821025821.818114335971;
        System.out.println(d);
        System.out.println(String.format("%2f", d)); // 2821025821.818114
        System.out.println(new DecimalFormat("##.######").format(d));

//        double d = 2821025821.818114335971;
//        DecimalFormat df = new DecimalFormat("#.########");
//        df.setRoundingMode(RoundingMode.CEILING);
//        System.out.println(df.format(d));
    }
}

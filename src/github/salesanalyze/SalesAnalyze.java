package github.salesanalyze;

import java.util.ArrayList;
import java.util.Random;

public class SalesAnalyze {
    // 주문리스트
    private ArrayList<Menu> orders;

    public SalesAnalyze() {
        orders = new ArrayList<Menu>();
    }

    // 메인테스트
    public static void main(String[] args) {
        SalesAnalyze sales = new SalesAnalyze();

        // 랜덤 주문 생성
        sales.randomOrders();

        // 매출 계산
        int totalSales = sales.calculateSales();
        System.out.println("총 매출액: " + totalSales + "원");
    }

    // 랜덤 주문 생성기
    public void randomOrders() {
        Random random = new Random();
        int n = 51 + random.nextInt(50);

        for (int i = 0; i < n; i++) {
            orders.add(randomOrder());
        }
    }

    private Menu randomOrder() {
        Menu menu = null;
        Random random = new Random();
        switch (random.nextInt(4)) {
            case 0:
                menu = new Pasta();
                break;
            case 1:
                menu = new Pizza();
                break;
            case 2:
                menu = new Salad();
                break;
            case 3:
                menu = new Soup();
                break;

        }
        return menu;
    }

    //매출 계산
    public int calculateSales() {
        int totalSales = 0;
        int pacount = 0;
        int picount = 0;
        int salcount = 0;
        int soucount = 0;

        for (Menu menu : orders) {
            if (menu.getClass() == Pasta.class)
                pacount++;
            else if (menu.getClass() == Pizza.class)
                picount++;
            else if (menu.getClass() == Salad.class)
                salcount++;
            else if (menu.getClass() == Soup.class)
                soucount++;

            totalSales += menu.getPrice();
        }

        int paSales = Pasta.PRICE * pacount;
        int piSales = Pizza.PRICE * picount;
        int salSales = Salad.PRICE * salcount;
        int souSales = Soup.PRICE * soucount;

        System.out.printf("[파스타] %d개: %d원\n", pacount, paSales);
        System.out.printf("[피자] %d개: %d원\n", picount, piSales);
        System.out.printf("[샐러드] %d개: %d원\n", salcount, salSales);
        System.out.printf("[달팽이 수프] %d개: %d원\n", soucount, souSales);
        System.out.println("==============================");

        return totalSales;
    }
}
//package huhyun;
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//public class NaverRank {
//    private static String TARGET = "https://datalab.naver.com/keyword/realtimeList.naver?where=main";
//
//    public static void main(String[] args) throws Exception {
//        Document doc = Jsoup.connect(TARGET).get();
//        try {
//            Elements elements = doc.select("ul.ranking_list > li > div.item_box");
//
//            for (Element element : elements) {
//                if (element.select("span.item_num").text().equals("10")) {
//                    System.out.println(element.select("span.item_num").get(0).html()
//                            + ". " + element.select("span.item_title").get(0).html());
//                    break;
//                }
//                System.out.println(element.select("span.item_num").get(0).html()
//                        + ". " + element.select("span.item_title").get(0).html());
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String url = "https://books.toscrape.com/";
        try{
            Document doc = Jsoup.connect(url).get();
            Elements elements = doc.select(".product_pod");

            for(Element elem : elements){
                String title = elem.select("h3").text();
                System.out.println(title);
            }

        }catch (IOException err){
            err.printStackTrace();
        }
    }
}

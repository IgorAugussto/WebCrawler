package igor.webcrawler;

import java.util.ArrayList;

import static igor.webcrawler.Functions.crawl;

public class Main {
    public static void main(String[] args) {
        String url = "https://www.nba.com/stats/players/traditional";
        crawl(1, url, new ArrayList<String>());
    }
}
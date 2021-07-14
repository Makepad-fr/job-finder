package io.makepad.boards;

import io.makepad.rss.Feed;
import io.makepad.rss.Job;
import io.makepad.rss.RSSFeedParser;

import java.util.ArrayList;
import java.util.List;

public class WWR {
    private RSSFeedParser parser;
    private String baseURL;
    public WWR(){
        this.baseURL = "https://weworkremotely.com/categories";
    }

    private List<Job> parseRSSForCategory(String url){
        String u = String.format("%s/%s.rss",this.baseURL,url);
        RSSFeedParser parser = new RSSFeedParser(u);
        Feed feed = parser.readFeed();
        System.out.println(feed);
        return feed.getMessages();
    }

    public List<Job> getJobs(CategoryTypes category) {
        switch (category) {
            case FullStackDeveloper:
                return parseRSSForCategory("remote-full-stack-programming-jobs");
            case CustomerSupport:
                return parseRSSForCategory("remote-customer-support-jobs.rss");
            case Product:
                return parseRSSForCategory("remote-product-jobs");
            case BackEndDeveloper:
                return  parseRSSForCategory("remote-back-end-programming-jobs");
            case FrontEndDeveloper:
                return parseRSSForCategory("remote-front-end-programming-jobs");
            case AllProgrammingJobs:
                return parseRSSForCategory("remote-programming-jobs");
            case SaleAndMarketing:
                return parseRSSForCategory("remote-sales-and-marketing-jobs");
            case Design:
                return parseRSSForCategory("remote-design-jobs");
            case DevopsAndSystemAdmin:
                return parseRSSForCategory("remote-devops-sysadmin-jobs");
            case other:
                return parseRSSForCategory("all-other-remote-jobs");
        }
        return new ArrayList<>();
    }

}

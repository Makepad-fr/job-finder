package io.makepad.boards;

import io.makepad.rss.Feed;
import io.makepad.rss.Job;
import io.makepad.rss.RSSFeedParser;

import java.util.ArrayList;
import java.util.List;

public class FossJobs {
    private RSSFeedParser parser;
    private String baseURL;
    public FossJobs(){
        this.baseURL = "https://www.fossjobs.net/rss/";
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
            case All:
                return parseRSSForCategory("all");
            case CustomerSupport:
                return parseRSSForCategory("support");
            case Administration:
                return parseRSSForCategory("administrators");
            case WritersAndEditors:
                return parseRSSForCategory("editors");
            case SaleAndMarketing:
                return parseRSSForCategory("marketing");
            case Design:
                return parseRSSForCategory("designers");
            case Managers:
                return parseRSSForCategory("managers");
            case Testers:
                return parseRSSForCategory("testers");
            case Consultants:
                return parseRSSForCategory("consultants");
            case AllProgrammingJobs:
                return parseRSSForCategory("programmers");
            case Researchers:
                return parseRSSForCategory("researchers");
            case Translators:
                return parseRSSForCategory("translators");
        }
        return new ArrayList<>();
    }
}

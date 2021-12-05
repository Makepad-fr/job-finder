package io.makepad.boards;

import io.makepad.rss.Feed;
import io.makepad.rss.Job;
import io.makepad.rss.RSSFeedParser;

import java.util.ArrayList;
import java.util.List;

public class Reddit {
    private RSSFeedParser parser;
    private String baseURL;
    public Reddit(){
        this.baseURL = "https://www.reddit.com/r";
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
            case JS:
                return parseRSSForCategory("remotejs");
            case php:
                return parseRSSForCategory("remotephp");
            case python:
                return parseRSSForCategory("remotepython");

        }
        return new ArrayList<>();
    }
}

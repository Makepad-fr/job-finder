package io.makepad.boards;

import io.makepad.rss.Feed;
import io.makepad.rss.Job;
import io.makepad.rss.RSSFeedParser;

import java.util.List;

public class Django {
    private RSSFeedParser parser;
    private String baseURL;
    public Django(){
        this.baseURL = "https://djangogigs.com/feeds/gigs";
    }

    private List<Job> parseRSSForCategory(String url){
        RSSFeedParser parser = new RSSFeedParser(this.baseURL);
        Feed feed = parser.readFeed();
        System.out.println(feed);
        return feed.getMessages();
    }
    public List<Job> getJobs() {

        return parseRSSForCategory(this.baseURL);
    }
}

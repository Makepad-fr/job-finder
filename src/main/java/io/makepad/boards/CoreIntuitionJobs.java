package io.makepad.boards;

import io.makepad.rss.Feed;
import io.makepad.rss.Job;
import io.makepad.rss.RSSFeedParser;

import java.util.List;

public class CoreIntuitionJobs {
    private RSSFeedParser parser;
    private String baseURL;
    public CoreIntuitionJobs(){
        this.baseURL = "http://jobs.coreint.org/rss.xml";
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

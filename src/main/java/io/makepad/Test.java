package io.makepad;

import io.makepad.bot.Bot;
import io.makepad.rss.Feed;
import io.makepad.rss.FeedMessage;
import io.makepad.rss.RSSFeedParser;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        //Bot b = new Bot();

        //full stack programming
        RSSFeedParser parser = new RSSFeedParser(
                "https://weworkremotely.com/categories/remote-full-stack-programming-jobs.rss");
        Feed feed = parser.readFeed();
        System.out.println(feed);
        PrintWriter out = new PrintWriter("full_stack_programming.txt");

        for (FeedMessage message : feed.getMessages()) {
           out.println(message);
           //System.out.println(message);
        }

        //customer support jobs
        RSSFeedParser parserCustomerSupport = new RSSFeedParser(
                "https://weworkremotely.com/categories/remote-customer-support-jobs.rss");
        Feed feedCustomerSupport = parserCustomerSupport.readFeed();
        System.out.println(feedCustomerSupport);
        PrintWriter outCustomerSupport = new PrintWriter("customer_support.txt");

        for (FeedMessage message : feedCustomerSupport.getMessages()) {
            outCustomerSupport.println(message);
        }

        //product  jobs
        RSSFeedParser parserProduct = new RSSFeedParser(
                "https://weworkremotely.com/categories/remote-product-jobs.rss");
        Feed feedProduct = parserProduct.readFeed();
        System.out.println(feedProduct);
        PrintWriter outProduct = new PrintWriter("product_jobs.txt");

        for (FeedMessage message : feedProduct.getMessages()) {
            outProduct.println(message);
        }

        // backend programming jobs
        RSSFeedParser parserBackendProgramming = new RSSFeedParser(
                "https://weworkremotely.com/categories/remote-back-end-programming-jobs.rss");
        Feed feedBackendProgramming = parserBackendProgramming.readFeed();
        System.out.println(feedBackendProgramming);
        PrintWriter outBackendProgramming = new PrintWriter("backend_programming.txt");

        for (FeedMessage message : feedBackendProgramming.getMessages()) {
            outBackendProgramming.println(message);
        }

        // frontend programming jobs
        RSSFeedParser parserFrontEndProgramming = new RSSFeedParser(
                "https://weworkremotely.com/categories/remote-front-end-programming-jobs.rss");
        Feed feedFrontEndProgramming = parserFrontEndProgramming.readFeed();
        System.out.println(feedFrontEndProgramming);
        PrintWriter outFrontEndProgramming = new PrintWriter("frontend_programming.txt");

        for (FeedMessage message : feedFrontEndProgramming.getMessages()) {
            outFrontEndProgramming.println(message);
        }

        // All programming jobs
        RSSFeedParser parserAllProgrammingJobs = new RSSFeedParser(
                "https://weworkremotely.com/categories/remote-programming-jobs.rss");
        Feed feedAllProgrammingJobs = parserAllProgrammingJobs.readFeed();
        System.out.println(feedAllProgrammingJobs);
        PrintWriter outAllProgrammingJobs = new PrintWriter("all_programming_jobs.txt");

        for (FeedMessage message : feedAllProgrammingJobs.getMessages()) {
            outAllProgrammingJobs.println(message);
        }

        // Sale and marketing jobs
        RSSFeedParser parserSalesAndMarketing = new RSSFeedParser(
                "https://weworkremotely.com/categories/remote-sales-and-marketing-jobs.rss");
        Feed feedSalesAndMarketing = parserSalesAndMarketing.readFeed();
        System.out.println(feedSalesAndMarketing);
        PrintWriter outSalesAndMarketing = new PrintWriter("sales_and_marketing.txt");

        for (FeedMessage message : feedSalesAndMarketing.getMessages()) {
            outSalesAndMarketing.println(message);
        }

       /* // Management and Finance
        RSSFeedParser parserManagementAndFinance = new RSSFeedParser(
                "https://weworkremotely.com/categories/remote-management-finance-jobs.rss");
        Feed feedManagementAndFinance = parserManagementAndFinance.readFeed();
        System.out.println(feedManagementAndFinance);
        PrintWriter outManagementAndFinance = new PrintWriter("management_and_finance.txt");

        for (FeedMessage message : feedManagementAndFinance.getMessages()) {
            outManagementAndFinance.println(message);
        }
*/
        // Design
        RSSFeedParser parserDesign = new RSSFeedParser(
                "https://weworkremotely.com/categories/remote-design-jobs.rss");
        Feed feedDesign = parserDesign.readFeed();
        System.out.println(feedDesign);
        PrintWriter outDesign = new PrintWriter("design.txt");

        for (FeedMessage message : feedDesign.getMessages()) {
            outDesign.println(message);
        }

        // Devops and System Admin
        RSSFeedParser parserDevopsAndSystemAdmin = new RSSFeedParser(
                "https://weworkremotely.com/categories/remote-devops-sysadmin-jobs.rss");
        Feed feedDevopsAndSystemAdmin = parserDesign.readFeed();
        System.out.println(feedDevopsAndSystemAdmin);
        PrintWriter outDevopsAndSystemAdmin = new PrintWriter("devops_and_system_admin.txt");

        for (FeedMessage message : feedDevopsAndSystemAdmin.getMessages()) {
            outDevopsAndSystemAdmin.println(message);
        }

        //other jobs
        RSSFeedParser parserOtherJobs = new RSSFeedParser(
                "https://weworkremotely.com/categories/all-other-remote-jobs.rss");
        Feed feedOtherJobs = parserOtherJobs.readFeed();
        System.out.println(feedOtherJobs);
        PrintWriter outOtherJobs = new PrintWriter("other_jobs.txt");

        for (FeedMessage message : feedOtherJobs.getMessages()) {
            outOtherJobs.println(message);
        }














    }

}

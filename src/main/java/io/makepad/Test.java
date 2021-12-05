package io.makepad;

import io.makepad.boards.CategoryTypes;
import io.makepad.boards.Python;
import io.makepad.boards.WWR;
import io.makepad.bot.carriereinfo.Bot;
import io.makepad.rss.Job;

import java.io.FileNotFoundException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        WWR wwr = new WWR();
        List<Job> l=  wwr.getJobs(CategoryTypes.FullStackDeveloper);
        System.out.println(l.size());

        Python p = new Python();
        List<Job> li = p.getJobs();
        System.out.println(li.size());

        //Bot b = new Bot();

    }

}

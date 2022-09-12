package groupId.artifactId.controller;

import groupId.artifactId.service.Statistics;
import groupId.artifactId.utilities.PrintCollectionsHtml;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ResultFormWithoutVoting", urlPatterns = "/result")
public class ResultFormWithoutVoting extends HttpServlet {


    private final PrintCollectionsHtml printCollectionsHtml =  new PrintCollectionsHtml();
    private final Statistics statistics =  new Statistics();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.write("<p>" + printCollectionsHtml.sortedPrint(statistics.sortVotes()) + "</p>");
        writer.println();
        writer.write("<p>" + printCollectionsHtml.sortedPrintWithScores(statistics.sortVotesAddScores()) + "</p>");

    }
}

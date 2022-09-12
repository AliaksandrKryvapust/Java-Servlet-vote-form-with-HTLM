package groupId.artifactId.controller;

import groupId.artifactId.service.*;
import groupId.artifactId.utilities.PrintCollectionsHtml;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ResultForm", urlPatterns = "/vote_result")
public class ResultForm extends HttpServlet {
    private final SingerValidate singerValidate = new SingerValidate();
    private final GenresValidate genreValidate = new GenresValidate();
    private final MessageValidate messageValidate = new MessageValidate();
    private final Vote vote = new Vote();
    private final Statistics statistics = new Statistics();
    private final PrintCollectionsHtml printCollectionsHtml = new PrintCollectionsHtml();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        String singer = req.getParameter("singer");
        String[] genresArr = req.getParameterValues("genres");
        String message = req.getParameter("message");
        PrintWriter writer = resp.getWriter();
        if (!singerValidate.IsSingersValid(singer) || !genreValidate.IsGenresValid(genresArr) || !messageValidate.IsTextValid(message)) {
            writer.write("<p> Error. Incorrect input. Vote results denied </p>");
        } else if (!genreValidate.IsGenresInputValid(genresArr)) {
            writer.write("<p> Error. Incorrect amount of checkboxes have been performed. Vote results denied </p>");
        } else
            vote.vote(singer, genresArr, message);
        writer.write("<p>" + printCollectionsHtml.sortedPrint(statistics.sortVotes()) + "</p>");
        writer.println();
        writer.write("<p>" + printCollectionsHtml.sortedPrintWithScores(statistics.sortVotesAddScores()) + "</p>");

    }
}

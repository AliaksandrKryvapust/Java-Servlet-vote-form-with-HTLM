package groupId.artifactId.controller;

import groupId.artifactId.model.Genres;
import groupId.artifactId.model.Messages;
import groupId.artifactId.model.Singers;
import groupId.artifactId.utilities.PrintCollectionsHtml;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "VotingServlet", urlPatterns = "/vote_form")
public class VotingServlet extends HttpServlet {
    private final Singers singerSingleton = Singers.getInstance();
    private final Genres genresSingleton = Genres.getInstance();

    private final Messages messagesSingleton = Messages.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher form = req.getRequestDispatcher("/voteForm.html");
        form.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8"); // to solve coding issues
        resp.setContentType("text/html; charset=UTF-8"); // to solve coding issues
        String singer = req.getParameter("singer");

        String[] genresArr = req.getParameterValues("genres");
        PrintWriter writer = resp.getWriter();
        if (genresArr.length <= 2 || genresArr.length >= 6) {
            writer.write("<p> Error. Incorrect amount of checkboxes have been performed. Vote results denied </p>");
        } else {
            singerSingleton.updateSingers(singer);
            genresSingleton.updateGenres(genresArr);
            String message = req.getParameter("message");
            messagesSingleton.updateMessages(message);
            writer.write("<p>" + PrintCollectionsHtml.sortedPrint() + "</p>");
            writer.println();
        }
    }

}


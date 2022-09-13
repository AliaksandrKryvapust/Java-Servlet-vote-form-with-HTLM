package groupId.artifactId.controller;

import groupId.artifactId.service.DataForHtml;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "VotingForm", urlPatterns = "/entry_form")
public class VotingForm extends HttpServlet {
    private final DataForHtml dataForHtml = new DataForHtml();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("dataForSingers", dataForHtml.dataForSingers());
        req.setAttribute("dataForGenres", dataForHtml.dataForGenres());
        RequestDispatcher form = req.getRequestDispatcher("/voteForm.jsp");
        form.forward(req, resp);
    }
}

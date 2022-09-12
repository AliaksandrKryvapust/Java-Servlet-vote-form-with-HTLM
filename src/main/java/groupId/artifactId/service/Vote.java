package groupId.artifactId.service;

import groupId.artifactId.dao.GenresDao;
import groupId.artifactId.dao.MessagesDao;
import groupId.artifactId.dao.SingersDao;
import groupId.artifactId.model.VoteResultSummary;

public class Vote {
    private final SingersDao singersDao = new SingersDao();
    private final GenresDao genresDao = new GenresDao();
    private final MessagesDao messagesDao = new MessagesDao();

    public void vote(String singersData, String[] genresData, String massageData) {
        singersDao.saveSingers(singersDao.getSinger(Integer.parseInt(singersData)));
        for (String str : genresData) {
            genresDao.saveGenres(genresDao.getGenre(Integer.parseInt(str)));
        }
        messagesDao.saveMessage(massageData);
    }
    public VoteResultSummary getAllVoteResults(){
        return new VoteResultSummary(singersDao.getSingersVotes(),
                genresDao.getGenresVote(),messagesDao.getSaveMessages());
    }

}

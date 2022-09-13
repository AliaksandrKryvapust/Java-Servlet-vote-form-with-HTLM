package groupId.artifactId.service;

import groupId.artifactId.dao.GenresDao;
import groupId.artifactId.dao.SingersDao;

import java.util.Map;

public class DataForHtml {
    SingersDao singersDao = new SingersDao();
    GenresDao genresDao = new GenresDao();
    public Map<Integer, String> dataForSingers(){
        return singersDao.getDataForHtml();
    }
    public Map<Integer,String> dataForGenres(){
        return genresDao.getGenresForHtml();
    }
}

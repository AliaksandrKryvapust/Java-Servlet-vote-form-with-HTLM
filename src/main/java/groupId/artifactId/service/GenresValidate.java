package groupId.artifactId.service;

import groupId.artifactId.dao.GenresDao;

public class GenresValidate {
    public boolean IsGenresValid(String[] arr){
        GenresDao genresDao = new GenresDao();
        int temp = 0;
        for ( String str: arr) {
            if (genresDao.isKeyValid(Integer.parseInt(str))){
                temp++;
            }
        }
        return temp==arr.length;
    }
    public boolean IsGenresInputValid(String [] arr){
        return arr.length > 2 && arr.length < 6;
    }
}

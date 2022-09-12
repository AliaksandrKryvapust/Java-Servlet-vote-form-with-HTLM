package groupId.artifactId.service;

import groupId.artifactId.dao.SingersDao;

public class SingerValidate {
    public boolean IsSingersValid(String str){
        SingersDao singersDao = new SingersDao();
        return singersDao.isKeyValid(Integer.parseInt(str));
    }

}

package pers.kylehsu.design.principle.demeter;


/**
 * Created by kylehsu
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }

}

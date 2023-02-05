package pers.kylehsu.design.principle.dependenceinversion;

/**
 * Created by kylehsu
 */
public class Kyle {

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    private ICourse iCourse;



    public void studyImoocCourse(){
        iCourse.studyCourse();
    }






}

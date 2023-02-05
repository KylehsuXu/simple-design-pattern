package pers.kylehsu.design.principle.dependenceinversion;

/**
 * Created by kylehsu
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("kylehsu在学习Java课程");
    }
}

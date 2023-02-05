package pers.kylehsu.design.principle.dependenceinversion;

/**
 * Created by kylehsu
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("kylehsu在学习FE课程");
    }

}

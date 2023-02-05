package pers.kylehsu.design.principle.dependenceinversion;

/**
 * Created by kylehsu
 */
public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("kylehsu在学习Python课程");
    }
}

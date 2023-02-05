package pers.kylehsu.design.principle.singleresponsibility;

/**
 * Created by kylehsu
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();

}

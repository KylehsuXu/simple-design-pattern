package pers.kylehsu.design.pattern.creational.abstractfactory;

/**
 * Created by kylehsu
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}

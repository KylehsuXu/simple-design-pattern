package pers.kylehsu.design.pattern.behavioral.iterator;

/**
 * Created by kylehsu.
 */
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();



}

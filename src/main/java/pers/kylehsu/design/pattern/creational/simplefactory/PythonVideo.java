package pers.kylehsu.design.pattern.creational.simplefactory;

/**
 * Created by kylehsu
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}

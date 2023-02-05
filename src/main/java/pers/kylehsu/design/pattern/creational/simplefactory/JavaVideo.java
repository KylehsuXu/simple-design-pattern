package pers.kylehsu.design.pattern.creational.simplefactory;

/**
 * Created by kylehsu
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}

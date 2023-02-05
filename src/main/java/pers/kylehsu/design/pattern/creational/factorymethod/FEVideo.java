package pers.kylehsu.design.pattern.creational.factorymethod;

/**
 * Created by kylehsu
 */
public class FEVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制FE课程视频");
    }
}

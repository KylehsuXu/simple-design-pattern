package pers.kylehsu.design.pattern.creational.factorymethod;

/**
 * Created by kylehsu
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}

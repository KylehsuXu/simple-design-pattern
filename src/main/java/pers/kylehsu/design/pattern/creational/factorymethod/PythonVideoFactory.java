package pers.kylehsu.design.pattern.creational.factorymethod;

/**
 * Created by kylehsu
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}

package pers.kylehsu.design.pattern.structural.adapter.classadapter;

/**
 * Created by kylehsu
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}

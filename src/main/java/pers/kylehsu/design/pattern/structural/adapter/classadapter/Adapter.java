package pers.kylehsu.design.pattern.structural.adapter.classadapter;

/**
 * Created by kylehsu
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }
}

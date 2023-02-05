package pers.kylehsu.design.pattern.structural.adapter.objectadapter;

/**
 * Created by kylehsu
 */
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}

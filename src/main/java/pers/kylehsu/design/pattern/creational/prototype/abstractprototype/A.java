package pers.kylehsu.design.pattern.creational.prototype.abstractprototype;

/**
 * Created by kylehsu
 */
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

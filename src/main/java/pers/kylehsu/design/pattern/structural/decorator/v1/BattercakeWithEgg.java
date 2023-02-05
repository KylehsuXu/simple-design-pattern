package pers.kylehsu.design.pattern.structural.decorator.v1;

/**
 * Created by kylehsu
 */
public class BattercakeWithEgg extends Battercake {
    @Override
    public String getDesc() {
        return super.getDesc()+" 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}

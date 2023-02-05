package pers.kylehsu.design.pattern.structural.decorator.v2;

/**
 * <h1>继承抽象的被装饰者：煎饼</h1>
 */
public class BatterCake extends ABatterCake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}

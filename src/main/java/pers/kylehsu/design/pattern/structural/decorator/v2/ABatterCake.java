package pers.kylehsu.design.pattern.structural.decorator.v2;

/**
 * <h1>对煎饼进行抽象</h1>
 * 被装饰者是煎饼(应该是抽象的，不确定的)，装饰者是鸡蛋和香肠（具体的）
 */
public abstract class ABatterCake {
    // 煎饼描述
    protected abstract String getDesc();
    // 煎饼价格
    protected abstract int cost();

}

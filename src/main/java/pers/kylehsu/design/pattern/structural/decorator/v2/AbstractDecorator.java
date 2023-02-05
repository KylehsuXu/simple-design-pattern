package pers.kylehsu.design.pattern.structural.decorator.v2;

/**
 * <h1>抽象装饰器</h1>
 * 抽象类继承抽象类：装饰类(本类，也是抽象类)，同时要继承被装饰的抽象类<p>
 * 注意：之所以把装饰器定义成抽象类，让子类去继承它，主要原因是为了要求子类去扩展，比如本类的doSth方法<p>
 * 当然，如果没有要求子类必须扩展某个方法的时候，这个类也可以不必要是抽象类也行
 */
public abstract class AbstractDecorator extends ABatterCake {

    // 构造器注入，对抽象煎饼进行初始化
    private ABatterCake aBatterCake;

    public AbstractDecorator(ABatterCake aBattercake) {
        this.aBatterCake = aBattercake;
    }

    protected abstract void doSth();

    @Override
    protected String getDesc() {
        return this.aBatterCake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBatterCake.cost();
    }
}

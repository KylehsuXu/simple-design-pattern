package pers.kylehsu.design.pattern.structural.decorator.v2;

/**
 * <h1>香肠装饰类，需要继承抽象装饰类</h1>
 */
public class SausageDecorator extends AbstractDecorator{
    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected void doSth() {
        System.out.println("香肠记得加热一下！ ");
    }
    // 加一跟香肠两块钱
    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}

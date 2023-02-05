package pers.kylehsu.design.pattern.structural.decorator.v2;

/**
 * <h1>鸡蛋装饰器，需要继承抽象装饰器</h2>
 */
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected void doSth() {
        System.out.println("鸡蛋我要煎蛋！ ");
    }

    // 加一个鸡蛋 加一块钱
    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}

package pers.kylehsu.design.pattern.structural.decorator.v2;

/**
 * 装饰器设计模式 测试类<p>
 * <p> 常见的应用，在源码中应用非常广泛
 * <p> Java IO包下应用：BufferedReader和BufferedInputStream\BufferedOutPutStream都是使用了装饰器模式。继承抽象Reader，构造器注入Reader
 * <p> Spring中的应用：TransactionAwareCacheDecorator是用来缓存和事务操作的类，从类名上就能看出来是一个装饰器，实现了Cache，那Cache就作为顶层接口
 * <p> MyBatis中的应用：Cache接口，类似于顶层的抽象类，子类去实现这个接口，然后用接口来接收，让Cache接口作为装饰器的入参进行包装，主要的包装类有FiFoCache\LruCache、ScheduleCache
 * <p> Servlet中的应用
 */
public class Test {
    public static void main(String[] args) {
        // 首先来个煎饼（实际被装饰者，用顶级抽象类：抽象装饰者接收）
        ABatterCake aBatterCake = new BatterCake();
        // 因为鸡蛋装饰者继承抽象的装饰者，而抽象装饰器继承抽象的煎饼，所以可以用抽象煎饼去接收，把被装饰的类作为入参
        // 在煎饼的基础上扩展2个鸡蛋：也就是需要包装一下煎饼
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new EggDecorator(aBatterCake);
        // 没吃饱，再扩展2个香肠：也就是需要包装一下煎饼
        aBatterCake = new SausageDecorator(aBatterCake);
        // 最后给我算算花了多少钱，其实是在装饰器类中利用了继承重写了方法去增强原来的类，从而计算好了价格
        System.out.println(aBatterCake.getDesc()+" 销售价格:"+ aBatterCake.cost());

    }
}

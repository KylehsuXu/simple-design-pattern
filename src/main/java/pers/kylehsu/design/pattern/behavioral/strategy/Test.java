package pers.kylehsu.design.pattern.behavioral.strategy;

import org.apache.commons.lang.StringUtils;

/**
 * 策略模式测试类
 * <p> 当我们需要新增一个优惠策略的时候，只需要写一个类实现促销接口即可
 * <p> 注意：策略使用的时候一般不是独立使用的，一般会结合工厂或单例、享元
 * <p> 常见应用：
 * <p> 1. JDK包下的Comparator比较器就是抽象的策略，它的各种实现类，如OrderComparator就是具体的策略。在使用的时候，比如Arrays.sort
 * 方法，要求传入Comparator接口策略，也就是说我们自己的类实现了Comparator比较器就可以传过来，进行数组的排序
 * <p> 2. JDK 中的 TreeMap，也是实现了Comparator接口对它进行加工
 * <p> 3. Spring.core中的Resource接口就是抽象的策略，提供了资源访问，具体的策略实现类有ClassPathResource、FileSystemResource、PathResource
 * <p> 4. ⭐️ Spring Bean的初始化也用到了策略模式
 *
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("************** ↓ 不能消除if else **************");
        cantEiminateIfElse("MANJIAN");
        System.out.println("************** ✓ 结合工厂模式可以消除if else ***************");
        eleminateIfElse("LIJIAN");
    }

    /**
     * @Description 可以消除if else
     * <p> 需要借助工厂模式
     */
    private static void eleminateIfElse(String strategyName) {
        PromotionActivity activity = new PromotionActivity(PromotionStrategyFactory.getPromtoionStrategy(strategyName));
        activity.executePromotionStrategy();
    }

    /**
     * 普通的策略模式 并不能消除if else 并且还要显式的去new
     */
    private static void cantEiminateIfElse(String strategyName){
        PromotionActivity activity;
        // 比如 如果是立减就规定创建618立减的活动，如果是满减就创建双11满减的活动
        if (StringUtils.equals(strategyName, "LIJIAN")){
            activity = new PromotionActivity(new LiJianPromotionStrategy());
        }else if (StringUtils.equals(strategyName, "MANJIAN")){
            activity = new PromotionActivity(new ManJianPromotionStrategy());
        }else {
            activity = new PromotionActivity(new FanXianPromotionStrategy());
        }

        activity.executePromotionStrategy();
    }
}

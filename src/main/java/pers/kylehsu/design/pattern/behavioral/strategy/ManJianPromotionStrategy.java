package pers.kylehsu.design.pattern.behavioral.strategy;

/**
 * 满减策略，实现促销策略接口
 */
public class ManJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("双11 满减促销,满200-20元");
    }
}

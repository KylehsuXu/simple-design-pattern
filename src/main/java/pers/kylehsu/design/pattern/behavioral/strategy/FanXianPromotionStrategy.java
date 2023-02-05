package pers.kylehsu.design.pattern.behavioral.strategy;

/**
 * 返现促销，实现促销策略接口
 */
public class FanXianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销,返回的金额存放到用户的余额中");
    }
}

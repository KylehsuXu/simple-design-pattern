package pers.kylehsu.design.pattern.behavioral.strategy;

/**
 * 立减策略，实现促销策略接口
 */
public class LiJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("618 立减促销, 所有商品的价格直接减去立减5元");
    }
}

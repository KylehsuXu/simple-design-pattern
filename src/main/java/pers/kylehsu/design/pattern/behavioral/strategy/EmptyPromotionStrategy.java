package pers.kylehsu.design.pattern.behavioral.strategy;

/**
 * <h1>促销策略：无</h1>
 */
public class EmptyPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无促销...");
    }
}

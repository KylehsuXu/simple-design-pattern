package pers.kylehsu.design.pattern.behavioral.strategy;

/**
 * <h1>促销接口</h1>
 *  针对促销，有3种促销策略，分别是满减、立减、返现
 */
public interface PromotionStrategy {
    // 促销方法
    void doPromotion();
}

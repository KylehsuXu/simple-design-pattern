package pers.kylehsu.design.pattern.behavioral.strategy;

/**
 * 促销活动
 * <p> 把促销策略的顶级接口作为参数具体使用哪种促销活动，把决定权交给上层
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;
    // 创建构造器，构造器参数是促销策略的接口
    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }
    // 对策略接口中的抽象方法进行包装
    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }

}

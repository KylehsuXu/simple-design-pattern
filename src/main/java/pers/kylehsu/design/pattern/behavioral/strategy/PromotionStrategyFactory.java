package pers.kylehsu.design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * <h1>促销工厂</h1>
 *  <p> 结合工厂模式，实现彻底消除多层if else </p>
 */
public class PromotionStrategyFactory {
    private static Map<String, PromotionStrategy> PROMTION_STRATEGY_FACTORY = new HashMap<>();

    // 静态块赋值
    static {
        PROMTION_STRATEGY_FACTORY.put(PromotionKey.LIJIAN, new LiJianPromotionStrategy());
        PROMTION_STRATEGY_FACTORY.put(PromotionKey.FANXIAN, new FanXianPromotionStrategy());
        PROMTION_STRATEGY_FACTORY.put(PromotionKey.MANJIAN, new ManJianPromotionStrategy());
    }

    // 不对外暴露，工厂的构造器
    private PromotionStrategyFactory() {
    }

    // 把无促销策略做成常量，返回的时候不会new
    private static final EmptyPromotionStrategy emptyPromotionStrategy = new EmptyPromotionStrategy();

    /**
     * 创建促销策略
     * @return 返回促销策略 的实例，实例从Map中获取
     */
    public static PromotionStrategy getPromtoionStrategy(String promotionStrategyType){
        Optional.ofNullable(promotionStrategyType).orElse(null);
        PromotionStrategy promotionStrategy = PROMTION_STRATEGY_FACTORY.get(promotionStrategyType);
        return promotionStrategy == null ? emptyPromotionStrategy : promotionStrategy;

    }

    // 把工厂的key填充上, 由于是接口，里面的都是常量public static final修饰的
    private interface PromotionKey {
        String LIJIAN = "LIJIAN";
        String FANXIAN = "FANXIAN";
        String MANJIAN = "MANJIAN";
    }
}

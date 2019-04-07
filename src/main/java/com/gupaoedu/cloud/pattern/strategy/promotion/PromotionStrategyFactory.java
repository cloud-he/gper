package com.gupaoedu.cloud.pattern.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mtime on 2019/4/7 0007.
 */
public class PromotionStrategyFactory {

    private static Map<String, IPromotionStrategy> promotionStrategyMap = new HashMap<>();

    static {

        promotionStrategyMap.put(PromotionKey.COUPON, new CouponStrategy());
        promotionStrategyMap.put(PromotionKey.CASHBACK, new CashBackStrategy());
        promotionStrategyMap.put(PromotionKey.DISCOUNT, new DiscountStrategy());

    }

    private PromotionStrategyFactory(){}

    public static IPromotionStrategy getPromotion(String promotionKey){
        IPromotionStrategy promotionStrategy = promotionStrategyMap.get(promotionKey);
        return promotionStrategy == null ? new NoPromotionStrategy() : promotionStrategy;


    }

    private interface PromotionKey{

        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String DISCOUNT = "DISCOUNT";

    }
}

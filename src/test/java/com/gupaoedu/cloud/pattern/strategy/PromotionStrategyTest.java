package com.gupaoedu.cloud.pattern.strategy;

import com.gupaoedu.cloud.pattern.strategy.promotion.PromotionActivity;
import com.gupaoedu.cloud.pattern.strategy.promotion.PromotionStrategyFactory;

/**
 * Created by Mtime on 2019/4/7 0007.
 */
public class PromotionStrategyTest {


    public static void main(String[] args) {

        String promotionKey = "DISCOUNT";

        PromotionActivity activity = new PromotionActivity(PromotionStrategyFactory.getPromotion(promotionKey));
        activity.run();

    }
}

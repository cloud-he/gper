package com.gupaoedu.cloud.pattern.strategy.promotion;

/**
 * Created by Mtime on 2019/4/7 0007.
 */
public class CashBackStrategy implements IPromotionStrategy {

    @Override
    public void promote() {
        System.out.println("Cash back promotion.");
    }
}

package com.gupaoedu.cloud.pattern.strategy.promotion;

/**
 * Created by Mtime on 2019/4/7 0007.
 */
public class PromotionActivity {

    private IPromotionStrategy ipromotionStrategy;

    public PromotionActivity(IPromotionStrategy ipromotionStrategy){
        this.ipromotionStrategy = ipromotionStrategy;
    }


    public void run(){
        this.ipromotionStrategy.promote();
    }
}

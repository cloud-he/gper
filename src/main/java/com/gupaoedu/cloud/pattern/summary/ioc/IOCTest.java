package com.gupaoedu.cloud.pattern.summary.ioc;

import javax.annotation.Resource;

/**
 * Created by Mtime on 2019/4/7 0007.
 */
public class IOCTest {
    @Resource
    private OneService oneService;

    public void iocTest(){
        this.oneService.doSomeThing();
    }
}

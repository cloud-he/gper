package com.gupaoedu.cloud.pattern.observer;

import com.google.common.eventbus.Subscribe;

/**
 * 观察者
 * Created by Mtime on 2019/4/7 0007.
 */
public class Teacher {
    private String name;
    public Teacher(String name){
        this.name = name;
    }
    @Subscribe
    public void update(Question question) {
        System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自“" + question.getGper().getName() + "”的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" +
                "提问者：" + question.getUserName());
    }
}

package com.gupaoedu.cloud.pattern.observer;

import com.google.common.eventbus.EventBus;

/**
 * Created by Mtime on 2019/4/7 0007.
 */
public class Question {
    private EventBus eventBus = new EventBus();
    private Gper gper;
    private String userName;
    private String content;

    public Question(String userName, String content) {
        this.userName = userName;
        this.content = content;
    }

    public Gper getGper() {
        return gper;
    }

    public void setGper(Gper gper) {
        this.gper = gper;
    }

    public EventBus getEventBus() {
        return eventBus;
    }
    /**
     *  增加要提醒的老师
     * @param teacher
     */
    public void  addTeacher(Teacher teacher){
        eventBus.register(teacher);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

package com.gupaoedu.cloud.pattern.observer;

/**
 * Created by Mtime on 2019/4/7 0007.
 */
public class GuavaObserveTest {
    public static void main(String[] args) {
        Gper gper = Gper.getInstance();
        Question question = new Question("keyingbo","发布问题11111");
        question.addTeacher(new Teacher("Tom"));
        question.addTeacher(new Teacher("Mic"));
        gper.publishQuestion(question);
    }
}

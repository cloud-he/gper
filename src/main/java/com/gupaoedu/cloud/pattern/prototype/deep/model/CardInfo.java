/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gupaoedu.cloud.pattern.prototype.deep.model;


import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.*;


/**
 * 卡信息
 *
 */
@Getter
@Setter
@ToString
public class CardInfo implements Cloneable,Serializable {

    private String cardId;
    private String phoneNo;
    private String passWord;
    private String userName;
    private CardType cardType;
    private String areaId;
    private String cinemaInnerCode;
    private int balance;
    private LocalDateTime effectiveEnd;
    private int spendTimes;
    private String cinemaName;
    private LocalDateTime issueTime;
    private LocalDateTime lastTime;


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gupaoedu.cloud.pattern.prototype.deep.dto;


import com.gupaoedu.cloud.pattern.prototype.deep.model.CardType;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;


/**
 * 卡信息
 *
 */
@Data
public class CardInfoDto implements Serializable {

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

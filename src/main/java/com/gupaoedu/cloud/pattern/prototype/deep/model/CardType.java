package com.gupaoedu.cloud.pattern.prototype.deep.model;

import java.io.Serializable;

import lombok.Data;

/**
 * 卡类型
 */
@Data
public class CardType implements Serializable {

    private long id;
    private String name;
    private String code;
}

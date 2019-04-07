package com.gupaoedu.cloud.pattern.prototype.deep.service;

import com.gupaoedu.cloud.pattern.prototype.deep.dto.CardInfoDto;
import com.gupaoedu.cloud.pattern.prototype.deep.model.CardInfo;
import com.gupaoedu.cloud.pattern.prototype.deep.model.CardType;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;

import cmc.common.utility.copy.CopyUtil;

/**
 * 卡服务
 */

public class CardService {

    private CardInfo cardInfo;

    public CardInfo getAttribute(){
        return this.cardInfo;
    }
    /**
     * 原始代码
     * @return 卡信息
     */
    public CardInfoDto getCardInfoDto(){
        CardInfo cardInfo = getCardInfo();
        this.cardInfo = cardInfo;
        CardInfoDto dto = new CardInfoDto();
        dto.setCardId(cardInfo.getCardId());
        dto.setPhoneNo(cardInfo.getPhoneNo());
        dto.setPassWord(cardInfo.getPassWord());
        dto.setUserName(cardInfo.getUserName());
        dto.setAreaId(cardInfo.getAreaId());
        dto.setCinemaInnerCode(cardInfo.getCinemaInnerCode());
        dto.setBalance(cardInfo.getBalance());
        dto.setEffectiveEnd(cardInfo.getEffectiveEnd());
        dto.setSpendTimes(cardInfo.getSpendTimes());
        dto.setCinemaName(cardInfo.getCinemaName());
        dto.setIssueTime(cardInfo.getIssueTime());
        dto.setLastTime(cardInfo.getLastTime());

        CardType type  = new CardType();
        type.setId(cardInfo.getCardType().getId());
        type.setName(cardInfo.getCardType().getName());
        type.setCode(cardInfo.getCardType().getCode());
        dto.setCardType(type);

        return dto;
    }

    /**
     * 运用原型模式
     * @return 卡信息
     */
    public CardInfoDto getCardInfoDto2(){
        CardInfo cardInfo = getCardInfo();
        this.cardInfo = cardInfo;
        CardInfoDto dto = new CardInfoDto();
        try {
            //没有深度克隆
            BeanUtils.copyProperties(dto,cardInfo);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return dto;
    }

    /**
     * 深度克隆
     * @return 卡信息
     */
    public CardInfoDto getCardInfoDto3(){
        CardInfo cardInfo = getCardInfo();
        this.cardInfo = cardInfo;
        return CopyUtil.copy(cardInfo, CardInfoDto.class);
    }


    private CardInfo getCardInfo(){
        CardType cardType = new CardType();
        cardType.setCode("810000012");
        cardType.setId(19863);
        cardType.setName("至尊卡");

        CardInfo cardInfo = new CardInfo();
        cardInfo.setCardId("123");
        cardInfo.setPhoneNo("1369359595");
        cardInfo.setPassWord("password123");
        cardInfo.setUserName("hxy");
        cardInfo.setCardType(cardType);
        cardInfo.setAreaId("01");
        cardInfo.setCinemaInnerCode("849");
        cardInfo.setBalance(100);
        cardInfo.setEffectiveEnd(LocalDateTime.now());
        cardInfo.setSpendTimes(1);
        cardInfo.setCinemaName("通州万达广场店");
        cardInfo.setIssueTime(LocalDateTime.now().minusYears(1));
        cardInfo.setLastTime(LocalDateTime.now());
        return cardInfo;
    }
}

package com.gupaoedu.cloud.pattern.prototype.deep.service;

import com.gupaoedu.cloud.pattern.prototype.deep.dto.CardInfoDto;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * hxy
 */
public class CardServiceTest {

    CardService cardService = new CardService();

    @Test
    public void testGetCardInfoDto(){
        CardInfoDto dto = cardService.getCardInfoDto();
        System.out.println(dto);
        assertEquals(false, dto.getCardType() == cardService.getAttribute().getCardType());
    }

    @Test
    public void testGetCardInfoDto2(){
        CardInfoDto dto = cardService.getCardInfoDto2();
        System.out.println(dto);
        assertEquals(false,dto.getCardType() == cardService.getAttribute().getCardType());
    }
}

package com.gupaoedu.cloud.pattern.prototype.deep.utils;

import com.gupaoedu.cloud.pattern.prototype.deep.dto.CardInfoDto;
import com.gupaoedu.cloud.pattern.prototype.deep.model.CardInfo;

import java.io.*;

/**
 * 复制bean
 */
public class CopyUtil {

    public static CardInfoDto convert(CardInfo cardInfo){
        try{

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(cardInfo);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            CardInfoDto copy = (CardInfoDto)ois.readObject();
            return copy;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}

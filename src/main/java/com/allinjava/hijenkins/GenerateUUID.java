package com.allinjava.hijenkins;

import java.util.UUID;

/**
 * @author: yuhang
 * @date: 2019/6/29
 */
public class GenerateUUID {
    public static void main(String[] args) {
        System.out.println(getUUID());
    }

    public static String getUUID(){
        String uuid = UUID.randomUUID().toString();
        //去掉“-”符号
        return uuid.replaceAll("-", "");
    }
}

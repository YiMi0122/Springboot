package com.atguigu.utils;

import java.util.Random;

/**
 * @author zljz
 * @create 2020-11-03 19:50
 */
public class RandomNum {
    public static int getRandInt(int fromNum,int toNum){
        return fromNum + new Random().nextInt(toNum-fromNum+1);
    }
}

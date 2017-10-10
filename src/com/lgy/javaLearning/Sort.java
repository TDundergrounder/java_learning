package com.lgy.javaLearning;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author gyliang
 *
 */
public class Sort {
    //要生成多少个随机数
    int num = 1000;
    int[] testArray = new int[num];
    Random rd = new Random();

    //产生随机数组
    public void ProduceNum() {
        for (int i = 0; i < num; i++) {
            int j = (int) (rd.nextInt(20000));
            testArray[i] = j;

        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Sort sort = new Sort();
        int n = sort.num;
        sort.ProduceNum();
        Arrays.sort(sort.testArray);

        for (int i = 0; i < n; i++) {
            System.out.println(sort.testArray[i]);
        }

    }
}
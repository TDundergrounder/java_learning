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
    public int num = 1000;
    int[] testArray = new int[num];
    Random rd = new Random();

    public int[] ProduceNum() {
        //取出20000以内的1000个随机数
        for (int i = 0; i < this.num; i++) {
            int j = (int) (rd.nextInt(20000));
            this.testArray[i] = j;
        }
        //对取出的1000个数字进行排序
        Arrays.sort(this.testArray);
        //依次遍历出所有的数字
        for(int i=0;i<this.num;i++){
                System.out.println(this.testArray[i]);
        }
        return testArray;
     }


    public static void main(String[] args) {
        Sort sort = new Sort();
        sort.ProduceNum();
    }
}
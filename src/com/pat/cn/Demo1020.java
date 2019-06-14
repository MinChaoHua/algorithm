package com.pat.cn;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 给定一个正整数数列，和正整数p，设这个数列中的最大值是M，最小值是m，如果M <= m * p，则称这个数列是完美数列。
 *
 * 现在给定参数p和一些正整数，请你从中选择尽可能多的数构成一个完美数列。
 *
 * */
public class Demo1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num[] = sc.nextLine().split(" ");
        String array[] = sc.nextLine().split(" ");
        int countNum = Integer.valueOf(num[0]);
        Arrays.sort(array);
        int allCount = 0;
        BigInteger multiply = new BigInteger(num[1]).multiply(new BigInteger(array[0]));
        for(int i=0;i<countNum;i++){
            if(multiply.compareTo(new BigInteger(array[i]))>=0) {
                allCount++;
            }
        }
        System.out.println(allCount);
    }
}


package com.pat.cn;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 正整数A的“DA（为1位整数）部分”定义为由A中所有DA组成的新整数PA。
 * 例如：给定A = 3862767，DA = 6，则A的“6部分”PA是66，因为A中有2个6。
 *
 *  现给定A、DA、B、DB，请编写程序计算PA + PB。
 * */
public class Demo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int DA = sc.nextInt();
        String B = sc.next();
        int DB = sc.nextInt();
        char[] charsA = A.toCharArray();
        char[] charsB = B.toCharArray();
        StringBuffer numA = getNum(charsA, DA);
        StringBuffer numB = getNum(charsB, DB);
        numA = (numA.length() >0 ) ? numA : numA.append("0");
        numB = (numB.length() > 0) ? numB : numB.append("0");

       System.out.println(new BigInteger(numA.toString()).add(new BigInteger(numB.toString())));

    }

    public  static StringBuffer getNum(char[] str,int num){
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0,len=str.length;i<len;i++){
            if(Integer.parseInt(String.valueOf(str[i]))==num){
                stringBuffer.append(num);
            }
        }
        return stringBuffer;
    }
}

package com.pat.cn;

import java.math.BigInteger;

import java.util.Scanner;

/**
 * 给定区间[-2的31次方, 2的31次方]内的3个整数A、B和C，请判断A+B是否大于C。
 * */
public class demo1001 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=0;i<num;i++){
            BigInteger A = scanner.nextBigInteger();
            BigInteger B = scanner.nextBigInteger();
            BigInteger C = scanner.nextBigInteger();
            if( A.add(B).intValue() >C.intValue() ){
                System.out.println("Case #"+(i+1)+":" +true);
            }else{
                System.out.println("Case #"+(i+1)+":" +false);
            }
        }
    }

}

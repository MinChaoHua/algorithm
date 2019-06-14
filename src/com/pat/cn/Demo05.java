package com.pat.cn;

import java.util.Scanner;

/**
 * Created by lang on 2016/1/18.
 */
public class Demo05 {
    int R = 0;
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int B = sc.nextInt();
        bigDiv(A, B);
    }
    static void bigDiv(String A,int B){
        StringBuffer Q = new StringBuffer();

        char[] cA = A.toCharArray();
        int r = 0;
        int a = 0;
        for (int i = 0; i < cA.length; i++) {
            a = r * 10 + Integer.parseInt(String.valueOf(cA[i]));
            Q.append(a/B);
            r = a % B;
        }
        while (Q.charAt(0)=='0')Q.delete(0,1);
        System.out.println(Q.toString()+" "+r);
    }

}
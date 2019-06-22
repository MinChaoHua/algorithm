package com.pat.cn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo09 {

    static int theEnterNum;
    public static void main(String[] args) throws IOException {
        System.out.println("输入一个数字:");
        theEnterNum = getInt();
        int sum = getSum(theEnterNum);
        System.out.println(sum);
    }

    public static int getSum(int n){
        if(n==1){
            return 1;
        }else{
            return (n+getSum(n-1));
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static int getInt() throws IOException {
        return Integer.valueOf(getString());
    }
}

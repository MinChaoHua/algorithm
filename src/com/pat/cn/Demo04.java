package com.pat.cn;

//本题要求计算A/B，其中A是不超过1000位的正整数，B是1位正整数。你需要输出商数Q和余数R，使得A = B * Q + R成立。

import java.math.BigInteger;
import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        BigInteger b1 = new BigInteger(s[0]);
        BigInteger b2 = new BigInteger(s[1]);
        System.out.println(b1.divide(b2)+" "+b1.mod(b2));
    }
}

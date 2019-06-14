package com.pat.cn;
/**
 * 给定一系列正整数，请按要求对数字进行分类，并输出以下5个数字：
 *
 * A1 = 能被5整除的数字中所有偶数的和；
 * A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
 * A3 = 被5除后余2的数字的个数；
 * A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
 * A5 = 被5除后余4的数字中最大数字。
 *
 * */

import java.text.DecimalFormat;
import java.util.Scanner;
public class demo02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        int num ;
        int A2Size=0,A4Size=0;
        int A1 = 0,A2=0,A3=0,A5=0;
        double A4=0;
        for(int i=1,len=nums.length;i<len;i++){
             num = Integer.valueOf(nums[i]);
             if(num%5==0 && num%2==0){
                 A1+=num;
             }

             if(num%5==1){
                 A2Size++;
                 if(A2Size%2==0){
                     A2-=num;
                 }else{
                     A2+=num;
                 }
             }
             if(num%5==2){
                 A3++;
             }
             if(num%5==3){
                 A4Size++;
                 A4+=num;
             }
             if(num%5==4){
                 if(A5<num){
                     A5 = num;
                 }
             }
        }
        System.out.print((A1==0?"N":A1)+" ");
        System.out.print((A2==0?"N":A2)+" ");
        System.out.print((A3==0?"N":A3)+" ");
        System.out.print((A4Size==0?"N":(new DecimalFormat("0.0").format(A4/A4Size)))+" ");
        System.out.print((A5==0?"N":A5));

    }
}
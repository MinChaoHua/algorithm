package com.pat.cn;

/**
 * 给定任一个各位数字不完全相同的4位正整数，如果我们先把4个数字按非递增排序，再按非递减排序，然后用第1个数字减第2个数字，将得到
 *  一个新的数字。一直重复这样做，我们很快会停在有“数字黑洞”之称的6174，这个神奇的数字也叫Kaprekar常数。
 *
 *  例如，我们从6767开始，将得到
 *
 *  7766 - 6677 = 1089
 *  9810 - 0189 = 9621
 *  9621 - 1269 = 8352
 *  8532 - 2358 = 6174
 *  7641 - 1467 = 6174
 *  ... ...
 *
 *  现给定任意4位正整数，请编写程序演示到达黑洞的过程。
 * */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char[] chars = sc.next().toCharArray();
        List<StringBuffer> list = getSum(chars);
        int sum = Integer.valueOf(list.get(0).toString())-Integer.valueOf(list.get(1).toString());
        if(sum==0||sum==6174){
            System.out.println(list.get(0)+" "+"-"+" "+list.get(1)+" "+"="+" "+sum);
        }
        char[] chars1 ;
        while(sum!=6174){
            chars1 = String.valueOf(sum).toCharArray();
            list = getSum(chars1);
            sum = Integer.valueOf(list.get(0).toString())-Integer.valueOf(list.get(1).toString());
            System.out.println(list.get(0)+" "+"-"+" "+list.get(1)+" "+"="+" "+sum);
       }
    }

    public static List<StringBuffer> getSum(char[] s){
        Arrays.sort(s);
        List<StringBuffer> list = new ArrayList<>();
        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
       for(int i=0;i<s.length;i++){
           stringBuffer1.append(s[i]);
       }
       for(int j=s.length-1;j>=0;j--){
           stringBuffer2.append(s[j]);
       }
       list.add(stringBuffer2);
       list.add(stringBuffer1);

       return  list;
    }
}

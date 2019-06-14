package com.pat.cn;

/**
 *
 * 大侦探福尔摩斯接到一张奇怪的字条：“我们约会吧！ 3485djDkxh4hhGE 2984akDfkkkkggEdsb s&hgsfdk d&Hyscvnm”。大侦探很
 *
 *  快就明白了，字条上奇怪的乱码实际上就是约会的时间“星期四 14:04”，因为前面两字符串中第1对相同的大写英文字母（大小写有区分）是
 *
 *  第4个字母'D'，代表星期四；第2对相同的字符是'E'，那是第5个英文字母，代表一天里的第14个钟头（于是一天的0点到23点由数字0到9、
 *
 *  以及大写字母A到N表示）；后面两字符串第1对相同的英文字母's'出现在第4个位置（从0开始计数）上，代表第4分钟。现给定两对字符串，
 *
 *  请帮助福尔摩斯解码得到约会的时间。
 * */
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String line3 = sc.nextLine();
        String line4 = sc.nextLine();
        char one=0,tow=0;
        int tree=0;
        int onecount=0;
        int treecount=0;
        int length1 = line1.length()>line2.length()?line2.length():line1.length();
        int length2 = line3.length()>line4.length()?line4.length():line3.length();

        for(int i=0;i<length1;i++){
            if(line2.charAt(i)==line1.charAt(i)){
                if(65<= line1.charAt(i) && line1.charAt(i)<=90 && onecount==0 ){
                    onecount++;
                    one = line2.charAt(i);
                } else if(onecount==1){
                    onecount++;
                    tow = line2.charAt(i);
                }
            }
        }
        for(int i=0;i<length2;i++){
            if(line3.charAt(i)==line4.charAt(i)){
                if(line3.charAt(i)==line4.charAt(i) && ((65<=line3.charAt(i) && line3.charAt(i)<=90) || (97<=line3.charAt(i)&& line3.charAt(i)<=122)) ) {
                    treecount++;
                    if(treecount==1){
                        tree = i;
                    }
                }
            }
        }
       String list[]= {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        System.out.println(list[one-65]+" "+(tow<64?"0"+tow:((tow-64)+9))+":"+(tree<10?"0"+tree:tree));
    }
}

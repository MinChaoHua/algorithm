package com.pat.cn;

import java.util.*;
public class Demo07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String s = "C J B";
        Map<String, Integer> victoryMap = new HashMap<>();
        victoryMap.put("C J",0);
        victoryMap.put("J B",0);
        victoryMap.put("B C",0);
        Map<String, Integer> failureMap = new HashMap<>();
        failureMap.put("J C",0);
        failureMap.put("B J",0);
        failureMap.put("C B",0);
        int num = Integer.valueOf (sc.nextLine());
        int count=0;
        if(sc.hasNext()){
            for(int i=0;i<num;i++){
                count++;
                list.add(sc.nextLine());
            }
        }

        if(count==num){
            sc.close();
        }
        String num2[] = getNum(failureMap, list, num).split(" ");

        String num1[] = getNum(victoryMap, list, num).split(" ");

        System.out.println(num1[num1.length-1]+" "+(num-Integer.valueOf(num1[num1.length-1])-Integer.valueOf(num2[num2.length-1]))+" "+num2[num2.length-1]);
        System.out.println(num2[num2.length-1]+" "+(num-Integer.valueOf(num1[num1.length-1])-Integer.valueOf(num2[num2.length-1]))+" "+num1[num1.length-1]);
        System.out.println(num1[0]+" "+((num2[0].equals(""))?s.replace(num1[0], "").replace(num1[1], "").trim():num2[1]));
    }

    public static String getNum(Map<String,Integer> map,List<String> list,int num){
        for(int i=0;i<num;i++){
            if(map.containsKey(list.get(i))){
                map.put(list.get(i),map.get(list.get(i))+1) ;
            }
        }
        int maxNum=0;
        int result=0;
        String maxKey="";
        Set<String> strings = map.keySet();
        for(String str:strings){
            result+=map.get(str);
            if( map.get(str)>maxNum){
                maxNum = map.get(str);
                maxKey = str;

            }
            if(map.get(str)==maxNum && maxKey!="" ){
                if(str.toCharArray()[0]<maxKey.toCharArray()[0]){
                    maxKey = str;
                }
            }
        }
        return maxKey+" "+maxNum+" "+result;
    }
}

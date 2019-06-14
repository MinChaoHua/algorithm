package com.pat.cn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Demo1018 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf =  new SimpleDateFormat("yyyy/MM/dd");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int personNumber = 0;

        String strings = sc.next();
        String stringbir = sc.next();
        String maxname = strings;
        String maxbir = stringbir;
        String minname = strings;
        String minbir = stringbir;

        if(sdf.parse(stringbir).getTime()>=sdf.parse("1814/09/06").getTime() &&sdf.parse(stringbir).getTime()<=sdf.parse("2014/09/06").getTime() ){
            personNumber=1;
        }else{
            personNumber=0;
        }
        for(int i=0;i<num-1;i++){
            if(sc.hasNext()){
                strings = sc.next();
                stringbir = sc.next();
                if(sdf.parse(stringbir).getTime()>=sdf.parse("1814/09/06").getTime() &&sdf.parse(stringbir).getTime()<=sdf.parse("2014/09/06").getTime()  ){
                    personNumber++;

                    if(sdf.parse(stringbir).getTime()<sdf.parse(maxbir).getTime()){
                        maxname = strings;
                        maxbir = stringbir;
                    }
                    if(sdf.parse(stringbir).getTime()>sdf.parse(minbir).getTime()){
                        minname = strings;
                        minbir = stringbir;
                    }
                    if(sdf.parse(minbir).getTime()>sdf.parse("2014/09/06").getTime()){
                        minname = strings;
                        minbir = stringbir;
                    }

                }
            }
        }
        System.out.println(personNumber+" "+maxname+" "+minname);
    }
}
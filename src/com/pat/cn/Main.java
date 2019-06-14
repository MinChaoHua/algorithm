package com.pat.cn;

import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long arr[] =new long[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if(num>=3){
            long maxsum = 0;
            long maxsum1 = arr[num-1]*arr[num-2]*arr[num-3];
            long maxsum2 = arr[0]*arr[1]* arr[num-1];
            if(maxsum1>maxsum2){
                maxsum = maxsum1;
            }else{
                maxsum = maxsum2;
            }
            System.out.println(maxsum);
        }

    }
}


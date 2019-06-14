package com.algorithm;
/**
 * 冒泡算法
 * 依次比较两个数的大小，然后交换位置。第一趟就找出了最大值
 *  21,25,13,45,11,23,34,56
 *
 * */
public class Bubble {
    public static void main(String[] args) {
        int arr[] = {21,25,13,45,11,23,34,56};
        for(int i=0;i<arr.length;i++){//比较的趟数，一次查出一个最大值，放在最后
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();
    }
}

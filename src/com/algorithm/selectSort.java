package com.algorithm;

/**
 * 选择排序
 *  1） 0 号位置的数子依次与后面的数字进行比较，后面的数字小于该数字，则交换两者的位置。
 *      接着比较用交换后的数子和后面的进行比较。
 *  2） 接着从 1号位置开始，重复 1 的操作
 *
 * */
public class selectSort {
    public static void main(String[] args) {
        int arr[] = {21,25,13,45,11,23,34,56};
        int min = 0;
        for(int i=0;i<arr.length;i++){
            min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    int temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}

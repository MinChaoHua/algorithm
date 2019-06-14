package com.algorithm;

/**
 * 插入排序
 *  标记一个数字，该数字左边的都比他要大，他右边的数字都是未排序的。
 *  选取第 0 个数，和第 1 个数比较，
 *  25, 21, 13, 45, 11, 23, 34, 56
 *  
 *
 * */
public class InsertSort {
    public static void main(String[] args) {
        int arr[] = {25, 21, 13, 45, 11, 23, 34, 56};
        int in,out;
        for(out=0;out<arr.length;out++){
            int temp = arr[out];//当out = 2;arr[2] = 13;
            in  = out;
            while(in > 0 && arr[in-1] >= temp){//arr[in-1] = 25;
                arr[in] = arr[in-1];//25向后移动，为arr[2] 的插入腾出空间
                --in;
            }
            arr[in] = temp;
        }//end for

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}

package com.queue;
/**
 * 用数组实现队列
 * */
public class Queue {

    private int maxSize;//size of stack array
    private Object[] queArray;
    private int front;
    private int rear;
    private int nItems;//当前队列的元素个数

    public Queue(int s){
        maxSize = s+1;
        queArray = new Object[maxSize];
        front = 0;//头
        rear = -1;//尾
        nItems = 0;
    }

    public void insert(long j){//插入元素
        if(rear == maxSize-1)
            rear = -1;
        queArray[++rear] = j;
        nItems++;
    }

    public long remove(){
        long temp = (long) queArray[front++];
        if(front==maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    public long peekFront(){
        return (long)queArray[front];
    }

    public Boolean isEmpty(){
        return (nItems == 0);
    }
    public Boolean isFull(){
        return (nItems == maxSize);
    }

    public int size(){
        return nItems;
    }

}

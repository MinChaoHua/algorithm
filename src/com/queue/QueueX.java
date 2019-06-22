package com.queue;

public class QueueX {
    private int maxSize;
    private Object[] queueArray;
    private int front;
    private int rear;
    public QueueX(int s){
        maxSize = s;
        queueArray = new Object[maxSize];
    }
}

package com.stack;
/**
 * 栈的实现
 * */
public class StackeX {
    private int maxSize;//size of stack array
    private Object[] stackarray;
    private int top;

    public StackeX(int s){
        maxSize = s;
        stackarray = new Object[maxSize];
        top = -1;//no items yet
    }

    public void push(Object j){
        stackarray[++top] = j;
    }

    public Object pop(){//take item from top of stack
        return stackarray[top--];
    }

    public Object peek(){//peek at top of stack
        return stackarray[top];
    }

    public Boolean isEmpty(){
        return (top==-1);
    }

    public Boolean isFull(){
        return (top==maxSize-1);
    }
}

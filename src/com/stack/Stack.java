package com.stack;
/**
 * 实现栈
 * */
public class Stack {

    public static void main(String[] args) {
        StackX stackX = new StackX(10);
        stackX.push(20);
        stackX.push(40);
        stackX.push(60);
        stackX.push(80);
        while(!stackX.isEmpty()){
            long value = stackX.pop();
            System.out.print(value);
            System.out.print(" ");

        }
    }
    public static class  StackX {
        private int maxSize;//size of stack array
        private long[] stackarray;
        private int top;

        public StackX (int s){
            maxSize = s;
            stackarray = new long[maxSize];
            top = -1;//no items yet
        }

        public void push(long j){
            stackarray[++top] = j;
        }

        public long pop(){//take item from top of stack
            return stackarray[top--];
        }

        public long peek(){//peek at top of stack
            return stackarray[top];
        }

        public Boolean isEmpty(){
            return (top==-1);
        }

        public Boolean isFull(){
            return (top==maxSize-1);
        }
    }
}

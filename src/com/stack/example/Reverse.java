package com.stack.example;

import com.stack.StackeX;

/**
 * 单词逆序  reverse方法
 * */
public class Reverse {

    private String input;
    private String output;

    public String doRev(){
        int stackSize = input.length();
        StackeX theStack = new StackeX(stackSize);
        for(int i=0;i<stackSize;i++){
            char c = input.charAt(i);
            theStack.push(c);
        }
        output="";
        while (!theStack.isEmpty()){
            char out = (char) theStack.peek();
            output = output + out;
        }
        return output;
    }
}

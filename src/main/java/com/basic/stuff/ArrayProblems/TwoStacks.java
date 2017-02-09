package com.basic.stuff.ArrayProblems;

/**
 * Created by sahilk on 03/02/17.
 * Create a data structure twoStacks that represents two stacks.
 * Implementation of twoStacks should use only one array, i.e., both stacks should use the same array for storing elements.
 * Following functions must be supported by twoStacks.
 */
public class TwoStacks {

    int [] array;
    int top1;
    int top2;

    public TwoStacks(int size) {
        array = new int[size];
        top1 = -1;
        top2 = array.length;
    }

    public void push1(int element){
        if(top1 >= array.length/2) {
            System.out.println("stack overflow");
            return;
        }
        top1++;
        array[top1] = element;

    }


    public void push2(int element){
        if (top2 < array.length/2 +1) {
            System.out.println("stack overflow");
            return;
        }
        top2--;
        array[top2] = element;
    }

    public int pop1(){
        if (top1 < 0) {
            System.out.println("stack empty");
            return 0;
        }
        int x = array[top1];
        top1--;
        return x;
    }

    public int pop2(){
        if (top2 <= array.length) {
            System.out.println("stack empty");
            return 0;
        }
        int x = array[top2];
        top2++;
        return x;

    }


    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from" +
                " stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from" +
                " stack2 is " + ts.pop2());
    }
}


package com.basic.stuff.Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sahilk on 07/02/17.
 */
class Base{
    int value = 0;
    Base(){
        addValue();
    }
    void addValue(){
        value += 10;
    }
    int getValue(){
        return value;
    }
}
class Derived extends Base{
    Derived(){
        addValue();
    }
    void addValue(){
        value +=  30;
    }
}
public class Test {
    public static void main(String[] args){
        Derived b= new Derived();
        System.out.println(b.getValue());
        Integer abc = null;
        System.out.println((abc != null));
        int [] numbers = new int[]{1,2};
        List<Integer> l1 = new ArrayList<>(Arrays.asList(10,1));
        List l2 = l1;
        l2.add("sahil");
        System.out.println(l2.toString());

    }
}

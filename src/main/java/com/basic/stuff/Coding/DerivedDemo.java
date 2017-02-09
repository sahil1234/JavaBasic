package com.basic.stuff.Coding;

/**
 * Created by sahilk on 14/01/17.
 */
public class DerivedDemo extends DemoClass {
    public void methodA(int a){
        System.out.println("Derived");
    }

    public static void main(String[] args) {
        DerivedDemo derivedDemo = new DerivedDemo();
        derivedDemo.methodA("as");

        DemoClass d = new DerivedDemo();
        DerivedDemo dd = (DerivedDemo) d;

        System.out.println(d == dd);


    }

    public void over(String s) throws NullPointerException {
        System.out.println("chota beta" + s);
    }

    public void over(Integer s) throws NullPointerException {
        System.out.println("chota beta" + s);
    }

}

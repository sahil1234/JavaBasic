package com.basic.stuff.Coding;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by sahilk on 14/01/17.
 * In deserialization those class which implement the Serializable interface there data is copied from the serialized
 * object no constructor is called for the class which implements Serializable interface even up in the hierarchy,
 * but for those super class which dnt implement Serializable interface there default constructor is called.
 */
public class SerializeRunner implements Serializable {

    int a;
    int b;

    int c;

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
       /* Serialize serial = new Serialize();
        serial.setA(1);
        serial.setB(2);

        System.out.println(file.createNewFile());
        FileOutputStream output = new FileOutputStream(file);
        ObjectOutputStream outputStream = new ObjectOutputStream(output);
        outputStream.writeObject(serial);
        output.close();
        outputStream.close();*/

//        File file = new File("./serial.ser");
//        FileInputStream inputStream = new FileInputStream(file);
//        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
//        SerializeRunner secondSerial = (SerializeRunner) objectInputStream.readObject();
//        System.out.println(secondSerial.getA()+ "  "+secondSerial.getB());


        Baap2 ob = new Beta();
        ob.b = 100;
        File file = new File("./serial2.ser");
        FileOutputStream output = new FileOutputStream(file);
        ObjectOutputStream outputStream = new ObjectOutputStream(output);
        outputStream.writeObject(ob);
        output.close();
        outputStream.close();
        Baap2.k = 150;

        FileInputStream inputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Beta secondSerial = (Beta) objectInputStream.readObject();
        System.out.println(secondSerial.toString());

    }

    public static class Baap1 {
        protected int a;
        protected transient int u;

    }

    public static class Baap2 extends Baap1 implements Serializable {
        protected int b;
        public static int k;
    }

    public static class Beta extends Baap2 {
        protected int c;
        public  Beta() {
            a= 10;
            b= 20;
            c= 30;
            u= 40;
            k= 50;
        }

        @Override
        public String toString() {
            return "" + a + "," + b + ","  + c + "," + u + ","  + k;
        }
    }
}



// file: Serialize ka object 1, id: 12
// id: 15
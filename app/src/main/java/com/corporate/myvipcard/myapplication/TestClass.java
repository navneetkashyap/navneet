package com.corporate.myvipcard.myapplication;

import android.util.Log;

public class TestClass {


    public TestClass() {
        Log.e("CONSTRUCTOR" , "CLASS");
    }

    public synchronized void add(){
        Log.e("SYNCHRONIZED" , "ADDD");
    }

    public synchronized void add1(){
        Log.e("SYNCHRONIZED TWO" , "ADDD1");
    }

    public static void staticAdd(){
        Log.e("STATIC BLOCK" , "STATIC");
    }



}

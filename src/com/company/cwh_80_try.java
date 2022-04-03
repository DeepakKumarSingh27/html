package com.company;

public class cwh_80_try {
    public static void main(String[] args) {
        int a=6000;
        int b=0;
//        without try
//        int c=a/b;
//        System.out.println("the result is "+ c);
//        with try
        try {
            int c = a / b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("we field to Divide Reason");
            System.out.println(e);
        }
        System.out.println("End to the program");
    }
}

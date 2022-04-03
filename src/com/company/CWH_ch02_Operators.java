package com.company;

public class CWH_ch02_Operators {
    public static void main(String[] args) {
        int a = 4;
       int b = 6 % a; // modolo operator is only in remander
        System.out.println(b);
        int c = 9;
        c *=7;
        System.out.println(c);
        // logical operators
        System.out.println(64>5 && 64>9);
        System.out.println(64>7 && 67>100);
        System.out.println(78>0 || 89>9);
        System.out.println(90>91 || 100> 10001);

    }
}

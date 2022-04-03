package com.company;
import java.util.Scanner;

public class cwh_79_errorsdemo {
    public static void main(String[] args) {
        /*
        Syntax error
        int a=0 -> throw error because I don't Use semicolon
        b=8; -> error b not declared
         */
//        logical Error
//        System.out.println(2);
//        for (int i = 1; i < 5; i++) {
//            System.out.println(2 * i + 1);
//        }
//    Runtime Error

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k"+1000/k);

    }
}

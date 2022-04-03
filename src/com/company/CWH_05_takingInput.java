package com.company;
import java.util.Scanner;
public class CWH_05_takingInput {
    public static void main(String[] args) {
       System.out.println("Taking user input");
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Number1 ");
//        int a=sc.nextInt();
//        System.out.println("Enter Number2");
//        int b=sc.nextInt();
//        int sum=a+b;
//        System.out.println("the sum of these number is");
//        System.out.println(sum);
//        boolean b=sc.hasNextInt();
//         boolean b=sc.hasNextInt();
//         System.out.println(b);
        String str=sc.nextLine();
        System.out.println(str);
    }
}

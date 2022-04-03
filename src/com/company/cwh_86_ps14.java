package com.company;

import java.util.Scanner;

public class cwh_86_ps14 {
    public static void main(String[] args) {
        // problem 01
        /*
        Syntax error
        int a=8-> syntax error occurs
//        Logical error
        int age=70;
        int year_burn=2000-6; //logical error
        System.out.println(age/0); // Run time error
           */
/*
       problem 02
        try{
            int a=66/9;
        }
        catch (IllegalArgumentException e) {
            System.out.println("HeHe");
        }
        catch (ArithmeticException e){
            System.out.println("HaHa");
        }

 */
//        problem 03
        boolean flag=true;
        int [] marks=new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the index");
        int i=0;
        while(flag && i<5){
            try {
                int index = sc.nextInt();
                System.out.println("The value of marks[index] is" + " "+marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }
    }
}

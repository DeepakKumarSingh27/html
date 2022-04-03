package com.company;
import java.util.Scanner;
public class CWH_06_Problem1 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter computer subject marks");
        float a=sc.nextFloat();
        System.out.println("Enter hindi subject marks");
        float b=sc.nextFloat();
        System.out.println("Enter Sanskrith subject marks");
        Float c=sc.nextFloat();
        System.out.println("Enter math subject marks");
        Float d=sc.nextFloat();
        System.out.println("Enter social science subject marks");
        float e=sc.nextFloat();
        float total=a+b+c+d+e;
        float avg=total/5;
      float perc =(total/500)*100;
//        float perc=((a+b+c+d+e)*100/500);
      System.out.println("total scored is "+total);
      System.out.println("the persantage is "+perc);
    System.out.println("the average is "+avg);


    }
}

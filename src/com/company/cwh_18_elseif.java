package com.company;
import java.util.Scanner;
public class cwh_18_elseif {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age ");
     int age = sc.nextInt();
     switch (age){
         case 18:
             System.out.println("you are going to become Adult!");

         case 23:
             System.out.println("you are get a job!");
             break;
         case 60:
             System.out.println("you are retried!");
             break;
         default:
             System.out.println("Enjoy your life");
     }
/*
     if(age > 67){
         System.out.println("You are Exprenced!");
     }
     else if(age > 45){
         System.out.println("You are semi Exprenced!");
     }
     else if(age> 30){
         System.out.println("You are semi semi Exprenced!");
     }
     else{
         System.out.println("you hava no exprenced");
     }

 */
    }
}

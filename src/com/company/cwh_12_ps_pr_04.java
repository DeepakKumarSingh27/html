package com.company;
import java.util.Scanner;
public class cwh_12_ps_pr_04 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of v");
        int v=sc.nextInt();
        System.out.println("Enter the value of U");
        int u=sc.nextInt();
        System.out.println("Enter the value of A");
        int a=sc.nextInt();
        System.out.println("Enter the value of S");
        int s= sc.nextInt();
        int exp=(v*v-u*u)/2*a*s;
        System.out.println(exp);


    }
}

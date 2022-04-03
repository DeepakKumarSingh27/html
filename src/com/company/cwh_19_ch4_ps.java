package com.company;
import java.util.Scanner;
public class cwh_19_ch4_ps {
    public static void main(String[] args) {
      //  Question 01
      /*  int a=10;
        if( a ==11){
            System.out.println(" i am 11");
        }
        else{
            System.out.println(" i am not 11");
        }

       */
       // Question 02
        /*
        byte m1,m2,m3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks in physics");
        m1=sc.nextByte();
        System.out.println("Enter your marks in math");
        m2=sc.nextByte();
        System.out.println("Enter your marks in chemistry");
        m3=sc.nextByte();
        float avg=(m1+m2+m3)/3.0f;
        System.out.println("your over all persantage is "+ avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("you have been promoted");
        }
        else{
            System.out.println("sorry, you have not promoted please try again");
        }

         */
//        Question 03
        /*
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter your in lakhs per annum");
        float tax=0;
        float income=sc.nextFloat();
        if(income<=2.5){
            tax=tax+ 0;
        }
        else if(income>2.5f && income <=5f){
            tax=tax+0.05f *(income - 2.5f);
        }
        else if(income>5f && income <=10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f *  (10.0f - 5f);
            tax = tax +0.3f *  (income - 10.0f);
        }
        System.out.println("Total tax paid by the Employee is" + tax);

         */
//        Question 04
        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1 to 7  ");
        int days = sc.nextInt();
        switch(days){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("satday");
                break;
            default:
                System.out.println("Day no match");
        }

         */
//        Question 06
        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the website name");
        String website=sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is indian website");
        }

         */
//        Question 05
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the years");
        int year= sc.nextInt();
        if((year % 400 == 0) || (year % 4 == 0 && year % 100!=0)){
            System.out.println(year +" is a leap year");
        }
        else{
            System.out.println(year + "is a not leap year");
        }
    }
}

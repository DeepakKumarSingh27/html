package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "i am toString()";
    }
    @Override
    public String getMessage() {
        return "i am get message()";
    }
}
public class cwh_83_exception_class {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=88;
      a=sc.nextInt();
      if(a<9){
          try {
//              throw new MyException();
              throw new ArithmeticException("This is an Exception");

          }
          catch (Exception e){
              System.out.println(e.getMessage());
              System.out.println(e.toString());
              e.printStackTrace();
              System.out.println("finished");
          }
          System.out.println("yes finished ");
      }
    }
}

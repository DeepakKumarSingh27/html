package com.company;
 class Emply{
    int salary;
    String name;
      void printdetail(){
         System.out.println("Emp name is"+ " "+ name);
         System.out.println("Emp salary is "+" "+ salary);
     }
}
public class cwh_38_custom_class {
    public static void main(String[] args) {
//        System.out.println("This is custom class");
        Emply deepak=new Emply();
        deepak.salary=101;
        deepak.name="Deepak";
        deepak.printdetail();
        Emply john=new Emply();
        john.salary=1002;
        john.name="gndu";
        john.printdetail();
//        System.out.println("salary is"+ " "+deepak.salary+" "+ deepak.name);
    }
}

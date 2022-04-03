package com.company;
 abstract class parent2{
  public  parent2(){
      System.out.println("i am a Base2 constructor");
    }
    public void sayhello(){
        System.out.println("say Hello");
    }
    abstract public void great();
}
 abstract class child2 extends parent2{
     @Override
     public void great(){

         System.out.println("Good morning");
     }
     public void great1(){

         System.out.println("Good afternoon");
     }
}
class child3 extends child2{
     public void great3(){
         System.out.println("good night");
     }
}
public class cwh_53_abstract {
    public static void main(String[] args) {
    child3 c=new child3();
//    child2 c2=new child2(); // errors abstract method don't creat object
   }
}

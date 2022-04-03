package com.company;
 class Base{
 int x;

     public int getX() {
         return x;
     }

     public void setX(int x) {
         this.x = x;
     }
 }
 class Derived extends Base {
     int y;

     public int getY() {
         return y;
     }

     public void setY(int y) {
         this.y = y;
     }
 }
 
public class cwh_45_inheritance {
    public static void main(String[] args) {
     Derived b=new Derived();
     b.setX(45);
     b.setY(34);
        System.out.println("i am Base class "+" "+b.getX());
        System.out.println("i am Derived class "+" "+b.getY());
    }
}

package com.company;

import java.sql.SQLOutput;

class Base1{
    int x;
  Base1(){
      System.out.println("i am a constructor");
  }
    Base1(int a){
        System.out.println("i am a overloaded  constructor"+" "+a);
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived1 extends Base1{
  Derived1(){
      super(0);
      System.out.println("i am a Derived class constructor");
  }
  Derived1(int x,int y){
      System.out.println("i am a overloaded Derived1 constructor"+" "+y);
  }
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

 public class cwh_46_constructors_in_inheritance {
    public static void main(String[] args) {
// Base1 b=new Base1();
  Derived1 d=new Derived1();
  Derived1 d1=new Derived1();

    }
}

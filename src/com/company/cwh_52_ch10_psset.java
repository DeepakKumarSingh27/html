package com.company;
class Circle{
  public int radius;
  Circle(int r){
      System.out.println("i am circle parametrized constructor");
      this.radius=r;
  }
  public double area(){
      return Math.PI*this.radius*this.radius;
  }
}
class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r,int h){
     super(r);
        System.out.println("i am cylinder1 parametrized constructor");
     this.height=h;
    }
  public double volume() {
      return Math.PI * this.radius * this.radius*this.height;
  }
}
public class cwh_52_ch10_psset {
    public static void main(String[] args) {
//        Question 01
//    Circle obj=new Circle(12);
        Cylinder1 c=new Cylinder1(12,4);

    }
}

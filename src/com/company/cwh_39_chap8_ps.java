package com.company;
class Employee{
 int salary;
 String name;
  public int getsalary(){
      return salary;
  }
  public String getName(){
      return name;
  }
  public void SetName(String n){
      name=n;
  }
}
 class cellphone{
 public void ringing(){
     System.out.println("Ringing....");
 }
 public void vibrating(){
     System.out.println("vibrating....");
 }
 public void call(){
     System.out.println("call Deepak");
 }
 }
 class square{
    int side;
    public int area(){
        return side*side;
    }
    public int parameter(){
        return 4*side;
    }
 }
 class tommy{
    public void hit(){
        System.out.println("heating the enemy");
    }
     public void run(){
         System.out.println("running the enemy");
     }
     public void fiting(){
         System.out.println("fiting the enemy");
     }
 }
public class cwh_39_chap8_ps {
    public static void main(String[] args) {
//        Question 01
//        Employee deepak=new Employee();
//        deepak.SetName("Deepak");
//        deepak.salary=1234;
//        System.out.println(deepak.getsalary());
//        System.out.println(deepak.getName());
//        Question 02
//      cellphone mobile=new cellphone();
//      mobile.ringing();
//      mobile.vibrating();
//      mobile.call();
//        Question 03
//      square a=new square();
//      a.side=3;
//        System.out.println(a.area());
//        System.out.println(a.parameter());
//     Question 05
    tommy t = new tommy();
    t.fiting();
    t.hit();
    t.run();
    }
}

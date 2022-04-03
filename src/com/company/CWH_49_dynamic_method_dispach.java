package com.company;
class phone{
    public void showtime(){
        System.out.println("time is 8am ");
    }
    public void on(){
        System.out.println("turning on phone");
    }
}
class smartphone extends phone{
    public void music(){
        System.out.println(" playing music");
    }
    public void on(){
        System.out.println("turning on smartphone ");
    }
}
public class CWH_49_dynamic_method_dispach {
    public static void main(String[] args) {
        /*
      phone obj =new phone();// Allowed
        smartphone s=new smartphone(); // allowed
      obj.name();

         */
        phone obj =new smartphone(); // yes it is allowed
     //   smartphone obj2 =new phone();   // Not Allowed
        obj.showtime();
        obj.on();
       // obj.music(); // not allowed
    }
}

package com.company;
 class MyThr extends Thread{
     public MyThr(String name){
        super(name);
    }
    public void run() {
         int i=34;
        System.out.println("Thank you");
//        while (true) {
//            System.out.println("i am a Thread");
//        }
    }
}
public class cwh_73_Thread_constructor {
    public static void main(String[] args) {
 MyThr t1=new MyThr("deepak");
 t1.start();
        System.out.println("The id of thread is" +" " + t1.getId());
        System.out.println("The name of thread is" +" " + t1.getName());
    }
}

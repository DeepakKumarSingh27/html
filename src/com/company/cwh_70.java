package com.company;
class MyThread extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<40000) {
            System.out.println("my cooking thread is running");
            System.out.println("i am happy!");
            i++;
        }
    }
}
class MyThread1 extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<40000) {
            System.out.println("Thread 2 is chatting with her  ");
            System.out.println("i am sad!");
            i++;
        }
    }
}
public class cwh_70 {
    public static void main(String[] args) {
    MyThread t1=new MyThread();
    MyThread1 t2=new MyThread1();
    t1.start();
    t2.start();
    }
}

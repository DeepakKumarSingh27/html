package com.company;
class practice13 extends Thread{
    public void run(){
        //while(true){
            System.out.println("Good Morning");
        }
    }
//}
class thr extends Thread{
    public void run(){
       // while(true){
            System.out.println("Welcome");
            try{
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
//}
public class cwh_76_ch13ps {
    public static void main(String[] args) {
 practice13 ps=new practice13();
 ps.start();
 thr t1=new thr();
 t1.start();
// t1.setPriority(6);
// ps.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(ps.getPriority());
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getState());
    }
}

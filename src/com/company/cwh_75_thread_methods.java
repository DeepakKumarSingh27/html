package com.company;
class MyNewThr1 extends Thread {
    public void run(){
        int i=0;
        while(i<70){
            System.out.println("Thank you");
            i++;
        }
    }
}
class MyThr2 extends Thread {
    public void run(){
        int i=0;
            while(true)
            {
            System.out.println(" My Thank you");
            try {
                Thread.sleep(455);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            i++;
        }
    }
}
public class cwh_75_thread_methods {
    public static void main(String[] args) {
   MyNewThr1 t1=new MyNewThr1();
   MyNewThr1 t2=new MyNewThr1();
   t1.start();
//   try{
//       t1.join();
//   }
//   catch (Exception e){
//       System.out.println(e);
//   }
   t2.start();
    }
}

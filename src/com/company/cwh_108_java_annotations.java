package com.company;
class NewPhone extends phone{
 public void showTime(){
     System.out.println("Time is 8 pm");
 }
 @Deprecated
 @SuppressWarnings("deprecated")
 public int sum(int a,int b){
     return a+b;
 }
}
public class cwh_108_java_annotations {
    public static void main(String[] args) {
     NewPhone phone=new NewPhone();
     phone.showtime();
     phone.sum(2,5);
    }
}

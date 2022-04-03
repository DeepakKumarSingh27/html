package com.company;
interface Bicycle{
    int b=45;
    void applyBreak(int decrement);
    void speedup(int increment);
}
interface HornBicycle{
    void blowBorn3g();
    void blowHornmnn();
}
class avon implements Bicycle ,HornBicycle{
    void blowHorn(){
        System.out.println("popo pee pee ");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying Break");
    }
    public void speedup(int increment){
        System.out.println("Applying speedup");
    }
    public void blowBorn3g(){
        System.out.println("horn blow ");
    }

    public void blowHornmnn(){
        System.out.println("horn hahahahahha");
    }
}
public class cwh_54_interfaces {
    public static void main(String[] args) {
     avon a=new avon();
     a.applyBreak(1);
     a.blowHorn();
        System.out.println(a.b);
       a.blowBorn3g();
       a.blowHornmnn();
    }
}

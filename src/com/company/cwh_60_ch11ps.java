package com.company;
abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainPen extends pen
{
    void write(){
        System.out.println("write ");
    }
    void refill(){
        System.out.println("refill");
    }
 void changeNib(){
     System.out.println("changing the Nib");
 }
}
 class monkey{
    void jump(){
        System.out.println("jumping");
    }
    void bite(){
        System.out.println("Biting....");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class human extends monkey implements BasicAnimal
{
    void speak(){
        System.out.println("Hello sir!");
    }
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}
 abstract class Telephone{
   abstract void ring();
   abstract void lift();
   abstract void disconnect();
}
class smartPhone extends Telephone{
    public void ring(){
        System.out.println("Ringing");
    }
    public void lift(){
        System.out.println("lifting");
    }
    public void disconnect(){
        System.out.println("Disconnecting....");
    }
}
public class cwh_60_ch11ps {
    public static void main(String[] args) {
//        Question 01,02
// fountainPen pen=new fountainPen();
// pen.changeNib();
//        Question 03
//        human h=new human();
//        h.eat();
//        h.speak();
//        h.bite();
//        h.jump();
//   Question 04
//        smartPhone s=new smartPhone();
//        s.disconnect();
//        s.lift();
//        s.ring();
//        Question 05
        monkey m1=new human();
        m1.bite();
        m1.jump();
    }
}

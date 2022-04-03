package com.company;
@FunctionalInterface
interface DemoAno{
    void meth1();
//    void meth2();
}
// class HarryFunc implements DemoAno{
//    public void meth1(){
//        System.out.println("This is method1");
//    }
//}
//class AnonyDemo implements DemoAno {
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("i am a method 1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("i am a method 2");
//    }
//}
 public class cwh_109_lamda {
    public static void main(String[] args) {
//      AnonyDemo obj=new AnonyDemo();
//      obj.meth1();
//      obj.meth2();
//        DemoAno obj=new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("i am a method 1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("i am a method 2");
//            }
//        };
//        obj.meth1();
//        DemoAno obj= new HarryFunc();
//        obj.meth1();
        DemoAno obj=()->{
            System.out.println("i am method1 lemda");
        };
        obj.meth1();
    }
}

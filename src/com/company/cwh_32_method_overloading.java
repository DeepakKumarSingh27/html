package com.company;

public class cwh_32_method_overloading {
    static void foo(){
        System.out.println("good morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning" +" "+ a +" " + "bro!");
    }
    static void foo(int a,int b){
        System.out.println("Good morning" +" "+ a +" " + "bro!");
        System.out.println("Good morning" +" "+ b +" " + "bro!");
    }
    static void change(int a){
        a=98;
    }
    static void change2(int [] arr){
        arr[0]=98;
    }
    static void telljoke(){
        System.out.println("i am inverted a new world\n" +
        "playing pubg");
    }

    public static void main(String[] args) {
//        telljoke();
//        int [] arr = {12,30,44,34,67};
//       case 1 changing the integer
//        int x=45;
//        change(x);
//        System.out.println("change x is"+ x);
//        case 2 changing the Arrays
//        int [] marks = {12,30,44,34,67};
//        change2(marks);
//        System.out.println("change x is"+ " "+marks[0]);
//        method overloading
        foo();
        foo(2);
        foo(3,5);

    }
}

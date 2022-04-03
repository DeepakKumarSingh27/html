package com.company;

public class cwh_35_practic_set8_onmethods {
static void  multiplication(int n){
    for(int i=1; i<=10; i++){
        System.out.format("%d X %d= %d\n",n,i,n*i);
    }
    }
    static void pattern1(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<i+1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
//    sum n= 1+2+3+......n;
//    sum n =1 + 2+ 3+......+n-1+n
//    sum = sum(n-1) +n;
//    sum = 3 +sum(2);
//    sum = 3 +sum(1);
//    sum = 3 +2+sum(1);
//    sum = 3+2+1;
     static int sumrec(int n){
     if(n==1){
        return 1;
     }
     return n + sumrec(n-1);
     }
     static  void pattern2(int n){
         for(int i=1;i<=n;i++){
             for(int j=n;j>=i;j--){
                 System.out.print("*  ");
             }
             System.out.println("   ");
         }
     }
    static  int fib(int n){
    if(n==1){
        return 0;
    }
    else if(n==2){
        return 1;
    }
    else{
        return fib(n-1) + fib(n-2);
    }
    }
    static void pattern1_rec(int n){

        if(n>0){
            pattern1_rec(n-1);
            for (int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void feb(int z){
    int calc=50;
    calc=(calc * 9/5) + 32;
        System.out.println("temp in faranhit" +" "+ calc);
    }
    static void avg(int n){
    int sum =0 ,i;
    for(i=0;i<n;i++){
        sum +=i;
    }
    sum=sum/i;
        System.out.println(sum);
    }
    public static void main(String[] args) {
//     Question 01
//        multiplication(8);
//        Question 02
//        pattern1(5);
//        Question 03
//        int c=sumrec(4);
//        System.out.println(c);
//        System.out.println();
//        int result=fib(7);
//        System.out.println(result);
//        pattern1_rec(5);
//        Question
//        pattern2(5);
//        Question 09
//          feb(10);
         avg(5);
    }
}

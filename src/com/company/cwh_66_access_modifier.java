package com.company;
class c1{
    public int x=5;
    protected  int y=45;
    int z=6;
    private int a=78;
    public void math1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class cwh_66_access_modifier {
    public static void main(String[] args) {
       c1 c=new c1();
       c.math1();
    }
}

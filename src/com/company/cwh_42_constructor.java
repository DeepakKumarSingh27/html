package com.company;
 class mymainEmployee{
 private int id;
 private String name;
 public mymainEmployee(){
     id=45;
     name="dksingh";
 }
     public mymainEmployee(String myname,int myid){
         id=myid;
         name=myname;
     }
 public String getName(){
     return name;
 }
 public void setName(String n){
  this.name=n;
 }
 public int getId(){
     return id;
 }
 public void setId(int i){
     this.id=i;
 }
 }
public class cwh_42_constructor {
    public static void main(String[] args) {
    mymainEmployee e=new mymainEmployee("dee",234556);
        mymainEmployee e2=new mymainEmployee();
//    e.setName("Deepak");
        System.out.println(e.getName());
//        e.setId(10089);
        System.out.println(e.getId());

    }
}

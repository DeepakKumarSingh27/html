package com.company;
class myEmployee{
   private int id;
   private String name;

   public String getName(){
       return name;
   }
   public void setName(String n){
       name=n;
   }
   public void setId(int i){
       id=i;
   }
   public int getId(){
       return id;
   }
}
public class cwh_40_ch9 {
    public static void main(String[] args) {
     myEmployee e=new myEmployee();
//     e.id=109;
//     e.name="dkl";
       e.setName("Deepak kumar");
        System.out.println(e.getName());
        e.setId(1099);
        System.out.println(e.getId());
    }
}

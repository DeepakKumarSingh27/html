package com.company;
  interface myCamera{
    void takeSnap();
    void recordVideo();
    default void record4kVideo(){
        System.out.println("Recording in 4k video");
    }
}
interface mywifi{
    String [] getNetwork();
    void connectToNetwork(String Network);
}
class myCellphone{
   void callNumber(int phoneNumber){
       System.out.println("Calling"+phoneNumber);
   }
   void pickCall(){
       System.out.println("connecting ....");
   }
}
class mySmartphone extends myCellphone implements mywifi,myCamera{
    public void takeSnap(){
        System.out.println("taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording the video");
    }
    public String[]getNetwork(){
        System.out.println("Getting list of network");
        String[]networkList={"harry","deepak","saturday","bgiet"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("connecting to"+network);
    }
}
public class cwh_57_default_methods {
    public static void main(String[] args) {
   mySmartphone ms=new mySmartphone();
   ms.record4kVideo();
   String[]ar=ms.getNetwork();
   for(String item:ar){
       System.out.println(item);
   }
    }
}

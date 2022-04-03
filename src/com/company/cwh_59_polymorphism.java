package com.company;
interface myCamera2{
    void takeSnap();
    void recordVideo();
    default void record4kVideo(){
        System.out.println("Recording in 4k video");
    }
}
interface myWifi2{
    String [] getNetwork();
    void connectToNetwork(String Network);
}
class myCellphone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling"+phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting ....");
    }
}
class mySmartphone2 extends myCellphone2 implements myWifi2,myCamera2{
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
public class cwh_59_polymorphism {
    public static void main(String[] args) {
        myCamera2 cam1=new mySmartphone2();
//        cam1.getNetwork();->  Not Allowed
        cam1.record4kVideo();
        mySmartphone2 s=new mySmartphone2();
        s.takeSnap();
        s.recordVideo();
        s.record4kVideo();
        s.callNumber(87888);

    }
}

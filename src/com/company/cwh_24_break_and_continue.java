package com.company;

public class cwh_24_break_and_continue {
    public static void main(String[] args) {
      //  for(int i=0; i<=5; i++) {
//            System.out.println(i);
//            System.out.println("java is great");
//
//            if (i == 2) {
//                System.out.println("Ending of loop");
//                break;
//           }
   //     }
//        int i=0;
//        while(i<=5){
//            System.out.println(i);
//            System.out.println("java is great");
//
//            if (i == 2) {
//                System.out.println("Ending of loop");
//                break;
//            }
//            i++;
//        }
//        System.out.println("end while loop");
//        int i=0;
//        do{
//
//
//            System.out.println(i);
//            System.out.println("java is great");
//
//            if (i == 2) {
//                System.out.println("Ending of loop");
//                break;
//            }
//            i++;
//        }while(i<=5);
        for(int j=1; j<=6; j++){
            if(j==2){
                System.out.println("End of loop");
                continue; // escape the intration
            }
            System.out.println(j);
            System.out.println("java is great");
        }
    }
}

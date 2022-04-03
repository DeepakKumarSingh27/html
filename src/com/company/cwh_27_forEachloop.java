package com.company;

public class cwh_27_forEachloop {
    public static void main(String[] args) {
     /*
      int [] marks={98,45,79,99,80};
        System.out.println(marks[2]);
        System.out.println(marks.length);
        float[] marks1={12.09f,23.89f,45,67,78};
        System.out.println(marks1[3]);
        String [] name={"Deepak","Haeey","hansh","aadi"};
        System.out.println(name[3]);
        char[] ch={'a','b','c','d'};
        System.out.println(ch[2]);

      */
//        int [] marks={98,45,79,99,80};
//        for(int i=0; i<marks.length;i++){
//            System.out.println(marks[i]);
//        }
        int[] marks = {98, 45, 79, 99, 80};
        for (int element : marks) {
            System.out.println(element);
        }
    }
}
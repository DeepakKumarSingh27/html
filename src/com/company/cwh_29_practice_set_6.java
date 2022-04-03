package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class cwh_29_practice_set_6 {
    public static void main(String[] args) {
//        Question 01
//        float sum=0;
//        float [] marks={12.4f,17.9f,16.8f,15.09f,14.87f};
//        for(float i=0;i<=marks.length;i++){
//            sum=sum+marks[i];
//        }
//        System.out.println(marks[i]);
//        float[] marks={12.09f,13.08f,67.08f,24.88f,68.04f};
//        float sum=0;
//        for(float element:marks){
//            sum+=element;
//        }
//        System.out.println(sum);
//        Question 02
//        float[] marks = {12.09f, 13.08f, 67.08f, 24.88f, 68.04f};
//        float num = 24.8f;
//        boolean isarray = false;
//        for (float element : marks) {
//            if (num == element) {
//                isarray = true;
//                break;
//            }
//        }
//        if (isarray) {
//            System.out.println("The valus is present in array");
//        }
//        else {
//            System.out.println("the valus is not present in array");
//        }
//        Question 03
        /*
        float [] marks={45.7f,67.8f,63.4f,99.2f,100.0f};
        float sum=0;
        for(float element:marks){
          sum+=element;
        }
        System.out.println("the avrage marks is"+sum/marks.length);

         */
//        Question 04
        /*
        int[][] mat1 = {{1, 2, 3},
                       {4, 5, 6}};
        int[][] mat2 = {{2, 6, 13},
                       {3, 7, 1}};
        int[][] result = {{0, 0, 0},
                         {0, 0, 0}};
        for (int i = 0; i < mat1.length; i++) {  // row number of times
            for (int j = 0; j < mat1[i].length; j++) {  // column numbers ot times
                System.out.format("setting value is i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
//        printing the elements of 2d matrix
        for (int i = 0; i < mat1.length; i++) {  // row number of times
            for (int j = 0; j < mat1[i].length; j++) {  // column numbers ot times
                System.out.print(result[i][j]+" ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }

         */
//         Question 05
        /*
       int [] arr={1,2,3,4,5};
       int l=arr.length;
       int n=Math.floorDiv(l,2);// because divided by 2 ex-> 5/2=2.5 but it is detect only 2
        int temp;
        for(int i=0;i<n;i++){
//            swap a[i] and a[l-1-i]
//            a b temp
//            |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for(int element:arr){
            System.out.print(element+" ");
        }

         */
//        Question 06
//        int [] arr={1,2,2100,3,4,5,3400};
//        int max=0;
//        for(int e:arr){
//            if(e>max){
//                max=e;
//            }
//        }
//        System.out.println("the maximum value is "+ max);
//        Question 07
        /*
        int [] arr={1,2,2100,3,4,5,3400};
        int min=0;
        for(int e:arr){
            if(e<min){
                min=e;
            }
        }
        System.out.println("the minimum value is "+ min);

         */
//        Question 07
        
    }
}
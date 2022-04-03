package com.company;

public class cwh_33_varargs {
        static int sum(int x,int  ...arr) {
            int result = x;
            for (int a : arr) {
                result += a;
            }
            return result;
        }
            public static void main (String[]args){
                System.out.println(sum(2,6,7,8,9));
                System.out.println(sum (2,4));
                System.out.println(sum(3,5,6,7));

            }
        }

package com.company;

/**
 * This is the good class
 */
public class cwh_107_methodtags {
    /**
     *
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("i am main method");
    }

    /**
     * Hello This is the method and this is the most beautiful
     * @param i This is the first Number to add
     * @param j This is the second Number to add
     * @return sum of two numbers as an integer
     * @throws Exception if i is 0
     * @deprecated This method is deprecated please used + operator
     */
       public int add(int i,int j) throws Exception{
           if(i==0){
               throw new Exception();
           }
           int c;
           c=i+j;
           return c;
        }
}

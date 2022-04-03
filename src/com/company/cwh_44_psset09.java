package com.company;

import java.awt.*;

class cylinder{
    private int redius;
    private int height;

    public cylinder(int redius, int height) {
        this.redius = redius;
        this.height = height;
    }

    public int getRedius() {
        return redius;
    }

    public void setRedius(int redius) {
        this.redius = redius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surrfaceArea(){
        return 2* Math.PI * redius * redius + 2*Math.PI*redius*height;
    }
    public double volume(){
        return Math.PI * redius *redius*height;
    }
    class Rectangle{
      private int length;
      private int breadth;

        public Rectangle(int length, int breadth) {
            this.length = 4;
            this.breadth = 5;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getBreadth() {
            return breadth;
        }

        public void setBreadth(int breadth) {
            this.breadth = breadth;
        }
    }
}
public class cwh_44_psset09 {
    public static void main(String[] args) {
/*


//         Question 01
     cylinder c=new cylinder(9,12);
//     c.setHeight(12);
        System.out.println(c.getHeight());
//        c.setRedius(9);
        System.out.println(c.getRedius());
        //        Question 02
        System.out.println(c.surrfaceArea());
        System.out.println(c.volume());


 */
        Rectangle r=new Rectangle();
//        System.out.println(r.getLength());
//        System.out.println(r.getBreadth());


    }
}

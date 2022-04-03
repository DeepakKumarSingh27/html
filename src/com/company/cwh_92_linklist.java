package com.company;

import java.util.*;

public class cwh_92_linklist {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer>l2=new LinkedList<>();
        l2.add(12);
        l2.add(13);
        l2.add(15);
        l2.add(16);
        l1.addAll(l2);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(5);
        l1.add(0,5);
        l1.add(0,10);
        l1.set(1,566);
        l1.addLast(899);
        l1.addFirst(9000);
        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        System.out.println(l1.remove(5));
        System.out.println(l1.contains(9000));
        //  System.out.println();
//       l1.clear();

        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(",");
        }
    }
}

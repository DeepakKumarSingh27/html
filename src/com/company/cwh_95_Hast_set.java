package com.company;

import java.util.HashSet;

public class cwh_95_Hast_set {
    public static void main(String[] args) {
        HashSet <Integer> myHashset =new HashSet<>(6,0.5f);
        myHashset.add(6);
        myHashset.add(8);
        myHashset.add(3);
        myHashset.add(11);
        myHashset.add(11);
        System.out.println(myHashset);
        System.out.println(myHashset.size());
        System.out.println(myHashset.iterator());
        System.out.println(myHashset.isEmpty());
        System.out.println(myHashset.stream().iterator());
    }
}

package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cwh_111_file {
    public static void main(String[] args) {
//        code to create the new file
        /*
       File myfile=new File("cwh111file.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }


//        code to write the file
        try {
            FileWriter fileWriter=new FileWriter("cwh111file.txt");
            fileWriter.write("This is our first file from this java course\n ok now bye");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


//        Reading the file
        File myFile=new File("cwh111file.txt");
        try {
            Scanner sc=new Scanner(myFile);
            while(sc.hasNextInt()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

         */
        File myFile=new File("cwh111.txt");
        if(myFile.delete()){
            System.out.println("i have deleted :"+ myFile.getName());
        }
        else{
            System.out.println("some error occurred while deleting this file");
        }
    }
}

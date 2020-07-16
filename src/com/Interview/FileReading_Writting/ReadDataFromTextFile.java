package com.Interview.FileReading_Writting;

import java.io.*;
import java.util.Scanner;

public class ReadDataFromTextFile {

    static FileReader fileReader;
    static BufferedReader bufferedReader;

    public static void main(String[] args) {
         String filePath = "src/com/Interview/FileReading/dataWriting.txt";
        fileReading3(filePath);
        }

    //Approach1 1. FileReader; 2. BufferReader
    static void fileReading1(String filePath){
        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);

            String str;
            while((str = bufferedReader.readLine()) != null){
                System.out.println(str);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //Approach2
    static void fileReading2(String filePath){
        try {
            File file = new File(filePath);
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    //Approach3
    static void fileReading3(String filePath){
        try {
            File file = new File(filePath);
            Scanner scan = new Scanner(file);
           scan.useDelimiter("\\z");
            System.out.println(scan.next());
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

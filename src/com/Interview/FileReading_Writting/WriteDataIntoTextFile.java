package com.Interview.FileReading_Writting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {
    static FileWriter fileWriter;
    static BufferedWriter bufferedWriter;

    public static void main(String[] args) {
        String filePath = "src/com/Interview/FileReading/dataWriting.txt";
        fileWriting(filePath);

    }
    static void fileWriting(String filePath){
        try{
             fileWriter = new FileWriter(filePath);
             bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("I am writing test text to specific text file.\n");

            bufferedWriter.write("By using this approach, we can write text to file,\n");
            bufferedWriter.write("and if we don't give the existing txt file's path, " +
                    "this way we can create new file in that directory. \n\n");
            bufferedWriter.write("if there was existing file, and if we give the path of that file,\n " +
                    "\nthis way we can update the context of the file");

            System.out.println("Finished");
            bufferedWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }



    }
}

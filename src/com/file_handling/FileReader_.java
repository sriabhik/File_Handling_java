package com.file_handling;

import java.io.*;

public class FileReader_ {
    public static void main(String[] args) throws IOException {
        File fin = new File("D:\\Attendance\\tcs.txt");

        //FileReader fin = new FileReader("D:\\Attendance");
        PrintStream p = new PrintStream(new File("D:\\Attendance\\save.txt"));
        PrintStream console = System.out;
        System.setOut(p);
        BufferedReader bf = new BufferedReader(new FileReader(fin));
        String line;
        try{
            while((line = bf.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}

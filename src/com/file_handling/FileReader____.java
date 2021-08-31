package com.file_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader____ {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("D:\\square.txt");
        FileWriter w = new FileWriter("D:\\inside.txt");
        String str;
        BufferedReader br = new BufferedReader(f);
        while((str = br.readLine())!= null){
            w.write(str +" -- ..");
        }
        f.close();
        w.close();
    }
}

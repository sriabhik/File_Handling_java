package com.file_handling;

import java.io.*;

public class FileInputStream_FileoutStream_ {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("D:\\square.txt");
        FileOutputStream ft = new FileOutputStream("D:\\write.txt");
        //BufferedReader br = new BufferedReader(new InputStreamReader(fin));
        int i;
        do{
            i = fin.read();
            ft.write(i);
        }while(i != -1);
        fin.close();
        ft.close();
    }
}

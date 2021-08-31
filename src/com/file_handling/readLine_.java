package com.file_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class readLine_ {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferReader Used to read stream of chracter input
        //InputStreamReader is a subclass of Reader which is used for convert byte stream to character stream
        String str = "";
        String [] store = new String[6];int i = 0;
        while (!str.equals( "-1")){
            str =  br.readLine();
            store[i++] = str;
        }
        for(String s: store)
            System.out.println(s);
    }
}

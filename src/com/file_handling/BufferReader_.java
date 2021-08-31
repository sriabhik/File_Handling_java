package com.file_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//inputstreamreader covert byte to character
        char ch;
        do{
            ch = (char)br.read();
            System.out.print(ch);
        }while(ch != 'q');
    }
}

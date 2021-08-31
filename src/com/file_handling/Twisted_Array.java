package com.file_handling;

import java.util.Arrays;
import java.util.Scanner;

public class Twisted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        for(int i = 0 ; i< n ; i++){
            int val = sc.nextInt();
            a[i] = val;
            b[i] = val;
        }
        int k = sc.nextInt();
        Arrays.sort(a);
        int [] ans = new int[n];
        for(int i = 0 ; i  <  k ; i++)
            ans[i] = a[i];
        for(int i = 0 ; i < n-k  ;i++ )
            ans[i+k] = b[i];
        for(int i = 0; i < n ; i++)
            System.out.println(ans[i]);
    }
}

package com.file_handling;

import java.util.Scanner;
class Ans{
    public static  String Solve(String str , int [] a, int n){
        char [] ch = new char[n];
        for(int i = 0; i< n ; i++){
            int val = str.charAt(i);
            if(val + a[i] > 122){
                a[i] -= 122 - val;
                a[i] = a[i] % 26;
                ch[i] = (char)(val + a[i]);
            }
            else{
                ch[i] = (char)(val+a[i]);
            }
        }
        String s = String.valueOf(ch);
        return s;
    }
}
public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ;  i < n ; i++){
            int val = sc.nextInt();
            a[i] = val;
        }
        String str = sc.next();
        Ans  a1 = new Ans();

        System.out.println(a1.Solve(str,a,n));
    }
}

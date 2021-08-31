package com.file_handling;

import java.util.Scanner;

public class Susmitha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans1 = 0;int ans2 = 0;int ans3 = 0;
        int[][] m = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j= 0;j < n ; j++){
                int val = sc.nextInt();
                m[i][j] = val;
                if(i == j)
                     ans1 += val;
                else if( i == n - j - 1)
                    ans2 += val;
                else
                    ans3 += val;

            }

        }
        System.out.println(ans1+ans2- ans3);

    }
}

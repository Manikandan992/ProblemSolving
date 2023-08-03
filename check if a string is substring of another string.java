package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s="test123string";
        String s2="123";
        int n=s.length(),m=s2.length(),i,j;
        for(i=0;i<n-m;i++){
            for(j=0;j<m;j++){
                if(s.charAt(i+j)!=s2.charAt(j))
                    break;
            }
            if(j==m){
                System.out.println(i);
                break;
            }
            else if(i==n-m-1 && j!=m)
                System.out.println("-1");
        }
    }
}
/* input:s="test123string",s2="123"
output: 4

Input:
        String 1: testing12
        String 2: 1234 
        Output: -1
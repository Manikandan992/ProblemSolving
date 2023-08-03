package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s="12345";
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print(s.charAt(j));
                }
                else if(j==n-1-i){
                    System.out.print(s.charAt(j));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*input:12345
output:
1   5
 2 4
  3
 2 4
1   5
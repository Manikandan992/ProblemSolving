package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int N = input.nextInt();
        int n=1;
        for(int i=1;i<=N;i++){
            int chk=i%2;
            if (chk==1){
                for (int j=n;j<=n+4;j++){
                    System.out.print(j+" ");
                }
                System.out.print("\n");
            }
            else{
                n+=9;
                for (int k=n;k>=n-4;k--){
                    System.out.print(k+" ");
                }
                System.out.print("\n");
                n+=1;
            }
        }
    }
    }
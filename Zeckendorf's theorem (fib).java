package com.company;

import java.util.Scanner;

public class Main {

    public static int  nearestSmallestFib(int n){
        int f1,f2,f3;
        if (n==0 || n==1){
            return n;
        }
        f1=0;f2=1;f3=1;
        while(f3<=n){
            f1=f2;
            f2=f3;
            f3=f1+f2;
        }
        return f2;
    }

    public static void fibonacci(int n){
        while(n>0){
            int f=nearestSmallestFib(n);
            System.out.print(f);
            n=n-f;
            if (n>0){
                System.out.print("+");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        fibonacci(n);
    }
}
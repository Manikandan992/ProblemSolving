package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(),i=0,j,k=0,t=0;
        int a[] = new int[100];
        while (n>0){
            a[i++]=n%2;
            n/=2;
        }
        for (j=i-1;j>=0;j--){
            if (a[j] == 1) {
                k++;
                if (k>t){
                    t=k;
                } }
            else
                    k=0;
            }
        System.out.println(t);
        }
    }


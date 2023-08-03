package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = {1,2,3,4,5,6,7,8,9};
        int n=a.length,i,j,k,temp;
        for(i=1;i<n;i++){
                for (j = 2; j < n; j++) {
                    if (a[j] > a[j - 2] && j%2==0) {
                        temp = a[j];
                        a[j]=a[j-2];
                        a[j-2]=temp;
                    }
                }
                for (k = 3; k < n; k++) {
                    if (a[k] < a[k - 2] && k%2 != 0) {
                        temp = a[k];
                        a[k]=a[k-2];
                        a[k-2]=temp;
                    }
                }
        }
        System.out.print(Arrays.toString(a));
    }
}
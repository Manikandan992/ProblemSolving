package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a={2,4,5,6,7,9,10,13};
        int[] b={2,3,4,5,6,7,8,9,11,15};
        int n1=a.length,n2=b.length,i=0,j=0;
        ArrayList<Integer> c = new ArrayList<Integer>();
        while(i<n1 && j<n2){
            if(a[i]<b[j])
                c.add(a[i++]);
            else
                c.add(b[j++]);
        }
        while(i<n1)  //copying remaining of array 1
            c.add(a[i++]);
        while(j<n2)  //copying remaining of array 2
            c.add(b[j++]);
        for (i=0;i<c.size()-1;i++){    //removing duplicates
                if(c.get(i)==c.get(i+1)){
                    c.remove(i);
                }
            }
        System.out.println("Merged array: "+c);
    }
}

/*
Input:
        Array 1: 2,4,5,6,7,9,10,13
        Array 2: 2,3,4,5,6,7,8,9,11,15
       Output:
       Merged array: 2,3,4,5,6,7,8,9,10,11,13,15
 */
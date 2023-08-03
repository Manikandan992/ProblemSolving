package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a[]=new int[100],b[]=new int[100],i,j,n,temp,k,temp2=0;
        n=input.nextInt();
        for (i=0;i<n;i++){
            a[i]=input.nextInt();
        }//bubble sort
        for (i=0;i<n;i++){
            for (j=1;j<n-i;j++){
                if (a[j]<a[j-1]){
                    temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }//Alternate Sort
        temp=n-1;
        for (k=0;k<n;k++){
            if(temp<temp2){
                break;
            }
            if(k%2==0){
                b[k]=a[temp2];
                temp2++;
            }
            else{
                b[k]=a[temp];
                temp--;
            }
        }//output
        for (i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
}
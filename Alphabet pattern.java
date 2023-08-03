package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt(),temp,i,temp2=0;
        int rem=a%26;temp=a;
        if(a ==26 && rem==0){
            System.out.print((char)(a+64));
        }
        else if (a>1 && a<26){
            System.out.print((char)(a+64));
        }
        else if (a>26){
            while (temp>0){
                temp/=10;
                temp2++;
            }
            if (rem>0){
                for (i=0;i<temp2;i++){
                    System.out.print((char)(rem+64));
                }
            }
            else{
                for (i=0;i<temp2;i++)
                System.out.print((char)(rem+90));
            }
        }
    }
}

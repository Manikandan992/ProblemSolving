package com.company;

import java.util.Scanner;

public class Main {
    public static String swap(String str,int i,int start){
        char[] ch=str.toCharArray();
        char temp=ch[i];
        ch[i]=ch[start];
        ch[start]=temp;
        return String.valueOf(ch);
    }
    public static void permute(String str,int start,int end){
        if (start==end){
            System.out.print(str+" ");
        }
        else{
        for (int i=start;i<=end;i++) {
            str=swap(str, i, start);
            permute(str, start + 1, end);
        }
        }
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String str=input.next();
        int start=0,end=str.length()-1;
        permute(str,start,end);
    }
}
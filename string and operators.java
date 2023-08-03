package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static StringBuffer anum=new StringBuffer(),aopt=new StringBuffer();
    public static ArrayList<Integer> arr= new ArrayList<Integer>();
    public static int i,k,n,len,val,j=0;

    public static void split(String a) {
        for (i = 0; i <= a.length() - 1; i++) {
            if (Character.isDigit(a.charAt(i))) {
                anum.append(a.charAt(i));
            } else
                aopt.append(a.charAt(i));
        }
        String j = anum.toString();
        k = Integer.parseInt(j);
        while (k > 0) {
            n = k % 10;
            arr.add(n);
            k /= 10;
        }
        len = arr.size()-1;
        for (i = 0; i < aopt.length(); i++) {
            if (aopt.charAt(i) == '+') {
                val = arr.get(len) + arr.get(len - 1);
                arr.set(len - 1, val);
                len--;
            } else if (aopt.charAt(i) == '-') {
                val = arr.get(len) - arr.get(len - 1);
                arr.set(len - 1, val);
                len--;
            } else if (aopt.charAt(i) == '*') {
                val = arr.get(len) * arr.get(len - 1);
                arr.set(len - 1, val);
                len--;
            } else if (aopt.charAt(i) == '/') {
                val = arr.get(len) / arr.get(len - 1);
                arr.set(len - 1, val);
                len--;
            }
            else if (aopt.charAt(i)=='%'){
                val=arr.get(len)%arr.get(len-1);
                arr.set(len-1,val);
                len--;}
        }
        System.out.println(val);
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String a=input.next();
        split(a);
    }
}

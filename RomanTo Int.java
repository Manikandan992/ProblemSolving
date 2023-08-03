package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static final Map<Character, Integer> roman =new HashMap<Character, Integer>()
    {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('M', 1000);
        put('C', 100);
        put('D', 500);
    }};

    public static int romanint(String a){
        int val=0,n=a.length();
        for (int i=0;i<n;i++){
            if (i != n-1 && a.charAt(i)<a.charAt(i+1)){
                val+=roman.get(a.charAt(i+1))-roman.get(a.charAt(i));
                i++;
            }
            else
                val+=roman.get(a.charAt(i));
        }
        return val;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String a=input.next();
        System.out.println(romanint(a.toUpperCase()));
    }
}
package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s1="grab";
        String s2="brag";
        int n1=s1.length(),n2=s2.length(),f=0;
        if(n1!=n2)
            f=1;
        else{
            char[] As1=s1.toLowerCase().toCharArray(),
                    As2=s2.toLowerCase().toCharArray();
            Arrays.sort(As1);
            Arrays.sort(As2);
            if(!Arrays.equals(As1,As2))
                f=1;
            if(f==0)
                System.out.println("The Given Strings are Anagrams");
            else
                System.out.println("The Given Strings are not Anagrams");
        }
    }
}
package com.company;

public class Main {
    public static void reverse(String[] s,int i){
        if(i==s.length)
            return;
        reverse(s,i+1);
        System.out.print(s[i]+" ");
    }

    public static void main(String[] args) {
        String s="I Love India";
        String[] sa=s.split(" ");
        reverse(sa,0);
    }
}

/*
Eg 1: Input: one two three
      Output: three two one
Eg 2: Input: I love india
      Output: india love I 
 */
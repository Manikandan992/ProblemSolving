package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int ans;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=1;i<=n;i++){
            if (i%2 == 1) {
                arr.add(i);
            }
        }
        ans = arr.get(0);
        for (int i=1;i<arr.size();i++) {
            if (i%2==1){
                ans+=arr.get(i);
            }
            else {
                ans-=arr.get(i);
            }
        }
        System.out.println(ans);
    }
}

/*input: 9
* output: -3
* explanation: Generate the series of odd numbers and do the arithmetic operations of the given sequence.
* a+b-c+d-e...+..-n 
* 9 -> 1+3-5+7-9 = -3*/
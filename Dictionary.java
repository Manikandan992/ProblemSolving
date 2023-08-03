package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), i;
        String name, num, query;
        Map<String, String> phoneBook = new HashMap<String, String>();
        for (i = 1; i <= n; i++) {
            name = input.next();
            num = input.next();
            phoneBook.put(name, num);
        }
        while (input.hasNext()){
            query = input.next();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else
                System.out.println("Not found");
        }
    }
}
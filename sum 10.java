package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num= input.nextInt();
        int sum=0,i,result,numcopy=num;
        while(num>0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        if(sum>0 && sum<10) {
            for (i = 1; i <= 10; i++) {
                result = i + sum;
                if (result == 10)
                    break;
            }
            System.out.println("The sum is : "+numcopy+i);
        }
        else if (sum==10){
            System.out.println("The Given input itself a sum : "+numcopy);
        }
        else
            System.out.println("The Given input is invalid");
    }
    }
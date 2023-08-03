package com.company;

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String a=input.next();
        char[] ac=a.toCharArray();
        int i=0,count,j;
        while(i<ac.length){
            count=0;
            if(ac[i]>='0' && ac[i]<='9' ){
                j=i;
                while(j<ac.length &&ac[j]>='0' && ac[j]<='9'){
                    count=(count*10)+(ac[j]-'0');
                    j++;
                }
                for(int k=0;k<count;k++){
                    System.out.print(ac[i-1]);
                }
                i=j;
            }
            else
                i++;
        }
    }
}
/*output:
    a2b3=aabbb;
 */
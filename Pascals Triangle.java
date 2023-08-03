package com.company;

public class Main {

    public static int fact(int f){
        if(f==0)
            return 1;
        return(f*fact(f-1));
    }

    public static void main(String[] args) {
        int n=5,i,j;
        for (i=0;i<=n;i++){
            for(j=0;j<=n-i;j++)
                System.out.print(" ");
            for(j=0;j<=i;j++)
                System.out.print(" "+fact(i)/((fact(i-j))*fact(j)));
            System.out.println();
        }
    }
}

/*
       1
      1 1
     1 2 1
    1 3 3 1
   1 4 6 4 1
  1 5 10 10 5 1
 */
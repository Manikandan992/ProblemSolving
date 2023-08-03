package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int row=input.nextInt(),column=input.nextInt(),i,j;
        int[][] matrix=new int[row][column];
        for (i=0;i<row;i++){
            for (j=0;j<column;j++){
                matrix[i][j]=input.nextInt();
            }
        }
        int rotation=input.nextInt();
        Clockwise co=new Clockwise();
        co.rotate(matrix,rotation,row,column);
        Anticlockwise ao=new Anticlockwise();
        ao.rotate(matrix,rotation);
    }
}

class Clockwise extends Main{
    public Clockwise(){
        System.out.println("Clockwise");
    }
    public void rotate(int[][] mat,int r,int m,int n){
        int i;
        for(i=0;i<r;i++){
            int row = 0, col = 0;
            int prev, curr;

            while (row < m && col < n) {
                if (row + 1 == m || col + 1 == n)
                    break;

                prev = mat[row + 1][col];

                for (i = col; i < n; i++) {
                    curr = mat[row][i];
                    mat[row][i] = prev;
                    prev = curr;
                }
                row++;

                for (i = row; i < m; i++)
                {
                    curr = mat[i][n-1];
                    mat[i][n-1] = prev;
                    prev = curr;
                }
                n--;

                if (row < m)
                {
                    for (i = n-1; i >= col; i--)
                    {
                        curr = mat[m-1][i];
                        mat[m-1][i] = prev;
                        prev = curr;
                    }
                }
                m--;

                if (col < n)
                {
                    for (i = m-1; i >= row; i--)
                    {
                        curr = mat[i][col];
                        mat[i][col] = prev;
                        prev = curr;
                    }
                }
                col++;
            }

            for (i = 0; i <=m; i++)
            {
                for (int j = 0; j <=n; j++)
                    System.out.print( mat[i][j] + " ");
                System.out.print("\n");
            }
        }
    }
}

class Anticlockwise extends Main{
    public Anticlockwise(){
        System.out.println("Anti Clockwise");
    }
    public void rotate(int[][] m,int r){

    }
}


---------------------------------------------------------------------------------------------------------------------------------------------------------------------------


package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int[][] rotateClockwise(int[][] m,int row,int col){
        int i,j,prev=m[1][0],temp;
                for (i = 0, j = 0; j < col; j++) {
                    temp = prev;
                    prev = m[i][j];
                    m[i][j] = temp;
                }
                for (i = 1, j = col - 1; i < row; i++) {
                    temp = prev;
                    prev = m[i][j];
                    m[i][j] = temp;
                }
                for (i = row - 1, j = col - 2; j >= 0; j--) {
                    temp = prev;
                    prev = m[i][j];
                    m[i][j] = temp;
                }
                for (i = row - 2, j = 0; i > 0; i--) {
                    temp = prev;
                    prev = m[i][j];
                    m[i][j] = temp;
                }
        return m;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Main obj=new Main();
        int row=input.nextInt(),column=input.nextInt(),i,j,rotation;
        int[][] matrix=new int[row][column];
        for (i=0;i<row;i++){
            for (j=0;j<column;j++){
                matrix[i][j]=input.nextInt();
            }
        }
        rotation=input.nextInt();
        for (i=0;i<rotation;i++) {
            matrix = obj.rotateClockwise(matrix, row, column);
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}


----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


package com.company;

import java.util.Arrays;
import java.util.Scanner;

class Clockwise extends Main{
    public Clockwise(){
        System.out.println("Clockwise");
    }
    public int[][] rotate(int[][] mat,int m,int n){
        {
            int row = 0, col = 0;
            int prev, curr;

            while (row < m && col < n) {

                if (row + 1 == m || col + 1 == n)
                    break;

                prev = mat[row + 1][col];

                for (int i = col; i < n; i++) {
                    curr = mat[row][i];
                    mat[row][i] = prev;
                    prev = curr;
                }
                row++;

                for (int i = row; i < m; i++) {
                    curr = mat[i][n - 1];
                    mat[i][n - 1] = prev;
                    prev = curr;
                }
                n--;

                if (row < m) {
                    for (int i = n - 1; i >= col; i--) {
                        curr = mat[m - 1][i];
                        mat[m - 1][i] = prev;
                        prev = curr;
                    }
                }
                m--;

                if (col < n) {
                    for (int i = m - 1; i >= row; i--) {
                        curr = mat[i][col];
                        mat[i][col] = prev;
                        prev = curr;
                    }
                }
                col++;
            }
        }
        return mat;
    }
}

class Anticlockwise extends Main{
    public Anticlockwise(){
        System.out.println("Anticlockwise");
    }
    public int[][] rotate(int[][] mat,int m,int n){
        {
            int row = 0, col = 0;
            int prev, curr;

            while (row < m && col < n) {

                if (row + 1 == m || col + 1 == n)
                    break;

                prev = mat[row][col+1];

                for (int i = col; i < n; i++) {
                    curr = mat[row][i];
                    mat[row][i] = prev;
                    prev = curr;
                }
                row++;

                for (int i = row; i < m; i++) {
                    curr = mat[i][n - 1];
                    mat[i][n - 1] = prev;
                    prev = curr;
                }
                n--;

                if (row < m) {
                    for (int i = n - 1; i >= col; i--) {
                        curr = mat[m - 1][i];
                        mat[m - 1][i] = prev;
                        prev = curr;
                    }
                }
                m--;

                if (col < n) {
                    for (int i = m - 1; i >= row; i--) {
                        curr = mat[i][col];
                        mat[i][col] = prev;
                        prev = curr;
                    }
                }
                col++;
            }
        }
        return mat;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt(), column = input.nextInt(), i, j, rotation;
        int[][] matrix = new int[row][column];
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        rotation = input.nextInt();
        Clockwise co = new Clockwise();
        for (i = 0; i < rotation; i++) {
            matrix = co.rotate(matrix, row, column);
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.print("\n");
        }
        Anticlockwise ao = new Anticlockwise();
        for (i = 0; i < rotation; i++) {
            matrix = ao.rotate(matrix, row, column);
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.print("\n");
        }
    }
}
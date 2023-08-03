import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt(),d,s=0;
        if (n>0){
            while (n>0){
                d=n%10;
                if (d%2==1)
                    s+=d;
                n=n/10;
            }
            if (s%2==0)
                System.out.println("sum of odd digits is even");
            else
                System.out.println("sum of odd digits is odd");
        }
    }
}

/*Input: 56895
output: sum of digits is odd
Explanation: The odd digits in 56895 are 5,9,5 their sum is 19 which is odd.*/

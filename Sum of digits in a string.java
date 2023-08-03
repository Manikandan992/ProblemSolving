import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        int sum = 0;
        for (int i=0; i<str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        if (sum <= 0){
            System.out.println("-1");
        }
        else {
            System.out.println(sum);
        }
    }
}

/*input: good23bad4
* output: 9
* explanation: Sum of digits in a string. 2+3+4 = 9*/
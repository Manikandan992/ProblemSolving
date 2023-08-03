import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer str1 = new StringBuffer(input.readLine());
        StringBuffer str2 = new StringBuffer(input.readLine());
        while(str1.length() != str2.length()){
                str1.deleteCharAt(0);
        }
        System.out.println(str1.append(str2));
    }
}

/*input: Hello
             hi
* output: lohi
* explanation: remove the starting letters until both the string length are same and concate them*/
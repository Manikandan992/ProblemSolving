import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String cc = input.readLine();
        if (cc.matches("#[A-F]{0,}[0-9]{0,}") && cc.length()==7){
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}

/*input: #FF9922
* output: Valid
* explanation: colour code should start with # followed by 6 characters as either numbers or alphabets*/
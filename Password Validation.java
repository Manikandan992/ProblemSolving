import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String password = input.readLine();
        if(password.matches(".*[0-9]{1,}.*") && password.matches(".*[@#$]{1,}.*")
                && password.length()>=6 && password.length()<=20){
            System.out.println("Valid password");
        }
        else{
            System.out.println("Invalid password");
        }
    }
}

/*input: #@6Don
* output:Valid password
* explanation: check whether the password contains atleast 1 special character, 1 number, and length between 6 and 20*/
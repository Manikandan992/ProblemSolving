import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer str = new StringBuffer(input.readLine());
        for (int i =0;i< str.length();i++){
            char c = str.charAt(i);
            if (i%2==0){
                if (c==122){
                    str.setCharAt(i,(char) (c - 25));
                }
                else{
                    str.setCharAt(i,(char) (c +1));
                }
            }
        }
        System.out.println(str);
    }
}

/*input: zzzz
* output:zaza
* explanation: Encrypt the string by replace the even number position letters with the next letter
*  and print encrypted string*/
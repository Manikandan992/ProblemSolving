import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int[] arr = new int[n];
        int sum = 0;
        for (int i=0;i<n;i++){
            arr[i] = Integer.parseInt(input.readLine());
            sum += (int) Math.pow(arr[i],i);
        }
        System.out.println(sum);
    }
}

/*input: 4
              5 3 7 2
* output:61
* explanation: add the power of the values with respect to their index
            (5*0 + 3*1 + 7*2 +2*3) == 61 */
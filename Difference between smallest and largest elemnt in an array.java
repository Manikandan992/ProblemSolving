import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int[] arr = new int[n];
        int min = 0;
        int max = 0;
        for (int i=0;i<n;i++){
            arr[i] = Integer.parseInt(input.readLine());
            min = arr[0];
            if(arr[i]>max){
                max = arr[i];
            }
            else if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(max-min);
    }
}

/*input: 4
              5 3 7 2
* output:5
* explanation: difference betweeen the largest and smallest element in an array
            7-2 = 5 */
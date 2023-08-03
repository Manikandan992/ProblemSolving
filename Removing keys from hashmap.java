import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        Map<Integer,String> map = new HashMap<>();
        for (int i=0;i<n;i++){
            map.put(Integer.parseInt(input.readLine()),input.readLine());
        }
        int count =0;
        Iterator<Integer> itr = map.keySet().iterator();
        while(itr.hasNext()){
            int m = itr.next();
            if (m % 4 != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}

/*input: 3
              2 hi
              4 hello
              12 hello world
* output: 1
* explanation: return the size of the map when all the keys which are multiples of 4 are removed.*/
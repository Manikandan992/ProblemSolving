import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String lr = input.readLine();
        String nr = input.readLine();
        int r = Integer.parseInt(input.readLine());
        lr = lr.substring(5);
        nr = nr.substring(5);
        int res = (Integer.parseInt(nr) - Integer.parseInt(lr)) * r;
        System.out.println(res);
    }
}

/*input: ABC2012345
              ABC2012660
              4
* output: 1260
* explanation: AAAAAXXXXX where AAAAA is consumer number and XXXXX is units.
calculatye the difference between the units and multiply with the rate per unit*/
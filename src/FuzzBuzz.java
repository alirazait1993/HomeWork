import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FuzzBuzz {

    public static void fizzBuzz(int n) {
        for (int i = 1; i<=n; i++)
        {
            if (i %3 ==0 && i %5 ==0){
                System.out.println("FizzBuzz");
                continue;
            }
            if (i %3 ==0){
                System.out.println("Fizz");
                continue;
            }
            if (i %5 ==0){
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        fizzBuzz(n);

        bufferedReader.close();
    }
}
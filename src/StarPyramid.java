import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StarPyramid {
        public static void main(String args[] ) throws Exception {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            printStars(n);
        }
        public static void printStars(int n) {
            int i, j;
            for (i = 0; i < n; i++) {
                for(j=2*(n-i-1); j>0; j--)
                {
                    System.out.print(" ");
                }
                for (j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
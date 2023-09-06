import java.util.Scanner;
import java.util.regex.Pattern;

public class StdInOut {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //int myInt = scanner.nextInt();
        //double myDoube = scanner.nextDouble();
        //scanner.nextLine();
        String myString = scanner.nextLine();
        scanner.close();

        System.out.println(Pattern.matches("000.12.12.034", myString));

        //System.out.println("String: "+myString);
        //System.out.println("Double: "+ myDoube);
        //System.out.println("Int: " +myInt);
    }
}

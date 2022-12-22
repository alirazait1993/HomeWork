import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    //Converting line string to objects
    public static void convertStringToList(String userString) {
        String[] splitedString = userString.split("\n");
        List<User> users = new ArrayList<>();
        Arrays.stream(splitedString).forEach(line -> {
            String[] properties = line.split(",");
            String userName = properties[0];
            String password = properties[1];
            String email = properties[2];
            User user = new User();
            user.setUsername(userName);
            user.setPassword(password);
            user.setEmail(email);
            users.add(user);
        });
        users.forEach(user -> {
            System.out.println(user);
        });
    }
    public static void FindWord(String sentence){
        String[] words = sentence.replace("\n",",").split(",");
        String word = words[5];
        System.out.println(word);
    }
    public static void main(String[] args) {
        String examples ="Abna,1234,abanoub.nes@gmail.com\nAlra,5678,ali.r@gmail.com";
        //convertStringToList(examples);
        FindWord(examples);

    }
}
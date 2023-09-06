import java.util.Stack;

public class StrReverse {
    public static void main(String[] args) {
        String word = "Bebo", newS= "";
        char ch;

        for (int i=0; i<word.length(); i++)
        {
            ch= word.charAt(i); //extracts each character
            newS= ch+newS; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ newS.toLowerCase());

        StringBuffer buff= new StringBuffer(word);
        System.out.println(buff.reverse().toString().toLowerCase());

        Stack<Character> stac=new Stack<>();
        String reversed= "";
        for (int i=0; i<word.length(); i++)
        {
            Character c= word.charAt(i);
            stac.push(c);
        }
        for (int i=0; i<word.length(); i++)
        {
            reversed+=stac.pop();
        }
        System.out.println(reversed);

        String ff="asdcvb";
    }
}
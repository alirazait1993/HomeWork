public class FindaStr {
    public static void main(String[] args) {
        String[] array = {"Ali", "Abanoub", "Ahmad", "Bebo"};

        for(int i = 0; i < array.length; i++){
            if(array[i].toLowerCase().startsWith("a"))
                System.out.println(array[i]);
        }
    }
}

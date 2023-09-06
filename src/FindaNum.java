public class FindaNum {
    public static void main(String[] args) {
        int n = 5;
        int[] array = {1,6,5,2,0};
        int index = -1;
        for(int i = 0; i < array.length; i++){
            if(array[i]==n){
                index = i;
            }
        }
        System.out.println(index);
    }
}

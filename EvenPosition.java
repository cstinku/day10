package java3;

public class EvenPosition {
    public static void main(String[] args) {
        int[] array =  {1,2,3,4,5};
        for(int i=1;i<array.length;i+=2){
            System.out.println(array[i]);
        }
    }
}

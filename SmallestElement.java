package java3;

public class SmallestElement {
    public static void main(String[] args) {
        int[] array = {13,6,9,2,12};
        int min = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("the smallest element in the array : " + min);
    }
}

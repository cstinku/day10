package java3;

public class FindLargestElement {
    public static void main(String[] args) {
        int[] array = {5,4,9,10,13,7};
        int max = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("the largest element in the array: "+max);
    }
}

package java3;

public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {5,9,2,6,11,3};
        int largest = array[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i=1;i<array.length;i++){
            if(array[i]>largest){
                secondLargest = largest;
                largest = array[i];
            } else if (array[i]> secondLargest) {
                secondLargest = array[i];
                
            }
        }
        System.out.println("the second largest element: "+ secondLargest);
    }
}

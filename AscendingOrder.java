package java3;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] array = {5,8,3,6,1};
        int temp;
        for(int i=0;i<array.length;i++){
            for(int j = i + 1;j< array.length;j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("ascending order: " );
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]+ " ");
        }
    }
}

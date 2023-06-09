package java3;

public class PrintDuplicateElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 1, 3, 5};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate element: " + array[i]);
                }
            }
        }
    }
}

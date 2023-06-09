package java3;

public class Frequency {
    public static void main(String[] args) {
        int[] array = {1,2,3,2,4,1,3,5};
        int[] frequency = new int[array.length];
        boolean[] visited = new boolean[array.length];

        for(int i=0;i< array.length;i++){
            if(visited[i]){
                continue;
            }
            int count=1;
            for(int j = i+1; j< array.length;j++){
                if(array[i] == array[j]){
                    visited[j] = true;
                    count++;
                }
            }
            frequency[i] = count;
        }
        for(int i=0;i< array.length;i++){
            if(visited[i]){
                continue;
            }
            System.out.println(array[i] + " occurs " + frequency[i] + " times.");
        }
    }
}

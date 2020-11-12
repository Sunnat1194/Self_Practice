package Practice_class;

public class Practice1 {
    public static void main(String[] args) {
      int[] arr ={1, 1, 2, 3, 3, 4, };

        for (int j = 0; j <=arr.length-1 ; j++) {
            int element = arr [j];
            int frequency = 0;
            for (int i = 0; i <= arr.length-1; i++) {
                if(arr[i] == element){
                    frequency++;
                }
            }
            if(frequency==1){
                System.out.print(element + " ");
        }

        }
    }
}

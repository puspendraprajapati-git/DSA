import java.util.Arrays;

public class arraySort {
    public static void main(String[] args){
        int arr[]={15,6,80,6,54,1,2,3};

        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}

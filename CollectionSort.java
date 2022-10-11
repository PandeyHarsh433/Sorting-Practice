import java.util.Arrays;
import java.util.Collections;

class MyComp implements Comparator<Integer> {
    
    public int compare(Integer a, Integer b) {
        return a%2 - b%2;
    }
}

public class CollectionSort {
    public static void main(String[] args) {

        Integer arr[] = {5,20,10,12};

        // Arrays.sort(arr,Collections.reverseOrder());

        Arrays.sort(arr, new MyComp());

        System.out.println(Arrays.toString(arr));   

        Collections.sort(list, c);
        
    }
}

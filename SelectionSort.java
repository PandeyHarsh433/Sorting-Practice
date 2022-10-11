public class SelectionSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            int min_ind = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_ind]) {
                    min_ind = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 1, 6, 5, 2 };
        selSort(arr);
        printArray(arr);
    }

}

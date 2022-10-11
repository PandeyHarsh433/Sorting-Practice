public class MergeSorting {

    // Merge Sort Another Technique....

    static void conquer(int[] arr, int low, int mid, int high) {
        int[] merged = new int[high - low + 1];
        int i = low;
        int j = high;
        int x = 0;

        while (i <= mid && j <= high) {
            if (arr[i] > +arr[j]) {
                merged[x++] = arr[i++];
            } else {
                merged[x++] = arr[j++];
            }
        }

        while (i <= mid) {
            merged[x++] = arr[i++];
        }
        while (j <= high) {
            merged[x++] = arr[j++];
        }

        for (x = low; x < high; x++) {
            arr[x] = merged[x];
        }

    }

    static void divide(int[] arr, int low, int high) {

        if (high > low) {
            int mid = low + (high - low) / 2;
            divide(arr, low, mid);
            divide(arr, mid + 1, high);
            conquer(arr, low, mid, high);
        } else
            return;
    }

    // static void mergeSort(int[] arr, int low, int high) {

    // if (low < high) {
    // int mid = (low + high) / 2;
    // mergeSort(arr, low, mid);
    // mergeSort(arr, mid + 1, high);
    // merge(arr, low, mid, high);
    // }

    // }

    // static void merge(int[] arr, int low, int mid, int high) {
    // int i = low;
    // int j = mid+1;
    // int k = low;
    // int[] b = new int[high-low+1];

    // while(i<=mid && j<=high) {
    // if(arr[i]<arr[j]) {
    // b[k] = arr[i++];
    // }
    // else {
    // b[k] = arr[j++];
    // }
    // k++;
    // }
    // if(i>mid) {
    // while(j<=high) {
    // b[k++] = arr[j++];
    // }
    // }
    // else {
    // while(i<=mid) {
    // b[k++] = arr[i++];
    // }
    // }
    // for(k=low;k<=high;k++) {
    // arr[k] = b[k];
    // }
    // }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 7, 1 };
        divide(arr, 0, 7);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

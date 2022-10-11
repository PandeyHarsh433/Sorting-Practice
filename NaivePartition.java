public class NaivePartition {
    static void partition(int arr[], int l, int h, int p) {
        int[] temp = new int[h - l + 1];
        int index = 0;
        for (int i = l; i <= h; i++)
            if (arr[i] <= arr[p] && i != p) {
                temp[index] = arr[i];
                index++;
            }
        temp[index++] = arr[p];
        for (int i = l; i <= h; i++)
            if (arr[i] > arr[p]) {
                temp[index] = arr[i];
                index++;
            }
        for (int i = l; i <= h; i++)
            arr[i] = temp[i - l];
    }

    public static void main(String[] args) {
        int[] arr = { 3, 8, 6, 12, 10, 7 ,5};
        partition(arr, 0,5,5);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

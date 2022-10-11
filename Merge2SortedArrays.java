public class Merge2SortedArrays {

    // static void mergeArray(int[] arr1, int[] arr2) {

    // int m = arr1.length;
    // int n = arr2.length;
    // int[] c = new int[m + n];

    // for (int i = 0; i < m; i++)
    // c[i] = arr1[i];

    // for (int j = 0; j < n; j++)
    // c[j + m] = arr2[j];

    // Arrays.sort(c);

    // for (int i = 0; i < m + n; i++)
    // System.out.print(c[i] + " ");
    // }

    static void mergeArray(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " ");
            else
                System.out.print(arr2[j++] + " ");
        }
        while (i < m)
            System.out.print(arr1[i++] + " ");
        while (j < n)
            System.out.print(arr2[j++] + " ");
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] arr2 = { 4, 5, 6, 7 };
        mergeArray(arr, arr2);
    }
}

public class TwoArrayIntersection {

    // Naive Soution

    static void getIntersec(int[] arr1, int[] arr2) {
        int m = arr1.length, n = arr2.length;

        for (int i = 0; i < m; i++) {
            if (i > 0 && arr1[i - 1] == arr1[i])
                continue;
            for (int j = 0; j < n; j++)
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
        }
    }

    // Efficient Solution

    static void getIntersect(int[] arr1, int[] arr2) {

        int m = arr1.length, n = arr2.length;
        int i = 0, j = 0;

        while (i < m && j < n) {

            if (i > 0 && arr1[i - 1] == arr1[i]) {
                i++;
                continue;
            }
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 10, 10, 10, 15, 15 };
        int[] arr2 = { 5, 10, 10, 15, 30 };
        getIntersect(arr, arr2);
    }
}

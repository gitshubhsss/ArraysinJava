public class smallestInArray {
    public static void descending(int arr[]) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    // swanp the largestw with smallest
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i]=temp;
                }
            }
            System.out.print(arr[i]+" ");
            i++;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 9 };
        descending(arr);
    }
}

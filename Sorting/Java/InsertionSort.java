import utils.ArrayUtils;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j -= 1;     
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};

        System.out.println("Array: ");
        ArrayUtils.printArray(arr);

        insertionSort(arr);       
        System.out.println("Sorted array: ");
        ArrayUtils.printArray(arr);
    }
}

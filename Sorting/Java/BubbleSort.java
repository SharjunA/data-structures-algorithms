import utils.ArrayUtils;

public class BubbleSort {
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        int i, j, temp;

        for (i = 0; i < n-1; i++) {
            swapped = false;

            for (j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 40, 55, 17, 27, 45};

        System.out.println("Array: ");
        ArrayUtils.printArray(arr);

        bubbleSort(arr);
        System.out.println("Sorted array:");
        ArrayUtils.printArray(arr);
    }
}
import java.util.List;

public class HeapSort {

    static void sort(int[] arr) {

        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            sort(arr, arr.length, i);
        }

        for (int i = arr.length - 1; i >= 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            sort(arr, i, 0);
        }
    }

    private static void sort(int[] arr, int length, int root) {
        int largest = root;
        int leftChild = 2 * root + 1;
        int rightChild = 2 * root + 2;

        if (leftChild < length && arr[largest] < arr[leftChild]) {
            largest = leftChild;
        }

        if (rightChild < length && arr[largest] < arr[rightChild]) {
            largest = rightChild;
        }

        if (largest != root) {
            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;

            sort(arr, length, largest);
        }

    }
}
public class QuickSort {

    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int startPos, int endPos) {
        int leftPos = startPos;
        int rightPos = endPos;
        int index = (startPos + endPos) / 2;
        int pivot = arr[index];

        while (leftPos <= rightPos) {
            while (arr[leftPos] < pivot) {
                leftPos++;
            }

            while (arr[rightPos] > pivot) {
                rightPos--;
            }

            if (leftPos <= rightPos) {
                if (leftPos < rightPos) {
                    int temp = arr[leftPos];
                    arr[leftPos] = arr[rightPos];
                    arr[rightPos] = temp;
                }
                leftPos++;
                rightPos--;
            }
        }

        if (leftPos < endPos) {
            sort(arr, leftPos, endPos);
        }
        if (startPos < rightPos) {
            sort(arr, startPos, rightPos);
        }
    }
}

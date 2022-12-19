import java.util.Date;

public class CompareSort {
    public CompareSort() {

        for (int i = 100000; i <= 100000; i += 100000) {

            int[] array1 = new int[i];
            for (int j = 0; j < array1.length; j++) {
                array1[j] = (int) (Math.random() * 100000);
            }

            int[] array2 = new int[array1.length];
            for (int k = 0; k < array1.length; k++) {
                array2[k] = array1[k];
            }

            int[] array3 = new int[array1.length];
            for(int l = 0; l < array1.length; l++){
                array3[l] = array1[l];
            }

            timing(i, array1, array2, array3);
        }
    }

    public void timing(int i, int[] array1, int[] array2, int[] array3) {
        Date startDate = new Date();
        QuickSort.sort(array1);
        Date endDate = new Date();

        long timeQuickSort = endDate.getTime() - startDate.getTime();

        startDate = new Date();
        HeapSort.sort(array2);
        endDate = new Date();

        long timeHeapSort = endDate.getTime() - startDate.getTime();

        startDate = new Date();
        BubbleSort.sort(array3);
        endDate = new Date();

        long timeBubbleSort = endDate.getTime() - startDate.getTime();

        toString(i, timeQuickSort, timeHeapSort, timeBubbleSort);
    }


    public void toString(int i, long timeQuickSort, long timeHeapSort, long timeBubbleSort) {
        System.out.println("i: " + i + "\nQuick sort duration: " + timeQuickSort + "\nHeap sort duration: " + timeHeapSort+ "\nBubble sort duration: " + timeBubbleSort);
    }
}

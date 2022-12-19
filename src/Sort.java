
public class Sort {

    public static void main(String[] args) {
        int[] arrayHeap = {5, 6, 0, 2, 1, 3, 8, 9, 2, 4};

        HeapSort.sort(arrayHeap);

        for (int array: arrayHeap) {
            System.out.println(array);
        }

        CompareSort compareSort = new CompareSort();
    }

}
import java.util.Arrays;

public class BubbleSort {
    void bubbleSort(int array[]) {
        int size = array.length;

        // run loops two times: one for walking throught the array
        // and the other for comparison
        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++)

                // To sort in descending order, change > to < in this line.
                if (array[j] > array[j + 1]) {

                    // swap if greater is at the rear position
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    // driver code
    public static void main(String args[]) {
        int[] data = { -2, 45, 0, 11, -9 };
        System.out.println(Arrays.toString(data));
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(data);
        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}
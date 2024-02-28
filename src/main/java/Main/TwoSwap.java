package Main;

public class TwoSwap {
    boolean checkSorted(int N, int[] A) {
        // code here
        int count = findUnsortedCount(A);

        if (count == 0 || count == 3) {
            return true;
        }

        if (count == 4) {
            // Swap twice and check whether the array is sorted.
            swapOne(A);
            swapOne(A);
            return findUnsortedCount(A) == 0;
        }

        return false;
    }

    int findUnsortedCount(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i + 1) {
                count++;
            }
        }

        return count;
    }

    void swapOne(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i + 1) {
                int temp = array[i];
                array[i] = array[temp - 1];
                array[temp - 1] = temp;

                break;
            }
        }

    }

}

public class Search {

    public static void main(String[] args) {
        int[] nums = { 12, 23, 17, 23, 42, 99, 60, 9, 6, 80 };

        iSelectionSort(nums);
        int index = binarySearch(nums, 99);
        System.out.println("80 found at position: " + index);
    }

    public static int LinearSearch(int[] data, int query) {
        int index = 0;
        while (index < data.length) {
            if (data[index] == query) {
                return index;
            } else {
                index++;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] data, int query) {
        int lowerB = 0;
        int upperB = data.length - 1;
        while (upperB >= lowerB) {
            int middle = ((upperB - lowerB) / 2) + lowerB;
            if (data[middle] == query) {
                return middle;
            } else if (data[middle] > query) {
                upperB = middle - 1;
            } else {
                lowerB = middle + 1;
            }
        }
        return -1;
    }

    public static void iSelectionSort(int[] data) {
        for (int sortedIndex = 0; sortedIndex < data.length; sortedIndex++) {
            int smallestIndex = sortedIndex;
            for (int queryIndex = sortedIndex + 1; queryIndex < data.length; queryIndex++) {
                if (data[queryIndex] < data[smallestIndex]) {
                    smallestIndex = queryIndex;
                }
            }
            iSwap(data, smallestIndex, sortedIndex);
        }
    }

    public static void iSwap(int[] data, int leftIndex, int rightIndex) {
        int temp = data[leftIndex];
        data[leftIndex] = data[rightIndex];
        data[rightIndex] = temp;
    }
}

// TO BE COMPLETED
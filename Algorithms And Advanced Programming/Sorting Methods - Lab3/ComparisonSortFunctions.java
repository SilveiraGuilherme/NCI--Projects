public class ComparisonSortFunctions {

    // INTEGER SORT FUNCTIONS
    public void iBubbleSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length - i; j++) {
                if (data[j - 1] > data[j]) {
                    iSwap(data, j - 1, j);
                }
            }
        }
    }

    public void iSelectionSort(int[] data) {
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

    public void iInsertionSort(int[] data) {
        int sortedIndex = 1;
        while (sortedIndex < data.length) {
            int currentQueryIndex = sortedIndex;
            while (currentQueryIndex > 0 && data[currentQueryIndex] < data[currentQueryIndex - 1]) {
                iSwap(data, currentQueryIndex, currentQueryIndex - 1);
                currentQueryIndex = currentQueryIndex - 1;
            }
            sortedIndex = sortedIndex + 1;
        }
    }

    public void iSwap(int[] data, int leftIndex, int rightIndex) {
        int temp = data[leftIndex];
        data[leftIndex] = data[rightIndex];
        data[rightIndex] = temp;
    }

    // STRING SORT FUNCTIONS
    public void sBubbleSort(String[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length - i; j++) {
                if (data[j - 1].compareTo(data[j]) > 0) {
                    sSwap(data, j - 1, j);
                }
            }
        }
    }

    public void sSelectionSort(String[] data) {
        for (int sortedIndex = 0; sortedIndex < data.length; sortedIndex++) {
            int smallestIndex = sortedIndex;
            for (int queryIndex = sortedIndex + 1; queryIndex < data.length; queryIndex++) {
                if (data[queryIndex].compareTo(data[smallestIndex]) < 0) {
                    smallestIndex = queryIndex;
                }
            }
            sSwap(data, smallestIndex, sortedIndex);
        }
    }

    public void sInsertionSort(String[] data) {
        int sortedIndex = 1;
        while (sortedIndex < data.length) {
            int currentQueryIndex = sortedIndex;
            while (currentQueryIndex > 0 && (data[currentQueryIndex].compareTo(data[currentQueryIndex - 1]) < 0)) {
                sSwap(data, currentQueryIndex, currentQueryIndex - 1);
                currentQueryIndex = currentQueryIndex - 1;
            }
            sortedIndex = sortedIndex + 1;
        }
    }

    public void sSwap(String[] data, int leftIndex, int rightIndex) {
        String temp = data[leftIndex];
        data[leftIndex] = data[rightIndex];
        data[rightIndex] = temp;
    }
}
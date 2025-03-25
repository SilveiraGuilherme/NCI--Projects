public class FilmSorter {

    public static void mergeSort(Film[] films, int lowerB, int upperB) {
        // Making sure that there is at least two elements in the list
        if (lowerB + 1 < upperB) {
            // Spliting the list by two and finding the middle element
            int mid = (lowerB + upperB) / 2;
            // Sorting the left side of the list recursively
            mergeSort(films, lowerB, mid);
            // Sorting the right side of the list recursively
            mergeSort(films, mid, upperB);
            // Merging both sides
            merge(films, lowerB, mid, upperB);
        }
    }

    public static void merge(Film[] films, int lowerB, int mid, int upperB) {
        // Initializing two pointers to the lowest index of each side (left and right)
        int i = lowerB, j = mid;
        // Creating a temporary list that will store the sorted values
        Film[] temp = new Film[upperB - lowerB];
        int k = 0;

        // Merging the two halves while comparing using compareTo()
        // This loop will stop when one of the sides is fully merged
        while (i < mid && j < upperB) {
            if (films[i].compareTo(films[j]) <= 0) {
                temp[k] = films[i];
                i++;
            } else {
                temp[k] = films[j];
                j++;
            }
            k++;
        }

        // If there are leftover elements, which are already sorted, in one of the
        // halves, we need to copy them into the temp ArrayList
        // Checking leftover elements in the left side and adding them to temp
        while (i < mid) {
            temp[k] = films[i];
            i++;
            k++;
        }
        // Checking leftover elements in the right side and adding them to temp
        while (j < upperB) {
            temp[k] = films[j];
            j++;
            k++;
        }

        // We need to copy the elements from temp[] back to the original array in the
        // correct range
        // This will put the elements in the right order into the original list
        for (int t = 0; t < temp.length; t++) {
            films[lowerB + t] = temp[t];
        }
    }

    // Analyzing the time it takes to sort lists with different sizes
    public static void timeAnalysis(Film[] films) {
        // Declare an array with all the sizes to be tested
        int[] sizes = { 10, 100, 1000, 5000, 10000 };
        System.out.println("=============== Sort Time Complexity ===============");

        // Test each one of the sizes (10, 100, 1000...)
        for (int size : sizes) {
            long totalTime = 0;
            int runs = 3; // Run the test 3 times for each size

            for (int i = 0; i < runs; i++) {
                // Create an empty array of the desired size
                Film[] testData = new Film[size];

                // Make a copy of the original films array containing the desired number of
                // elements
                for (int j = 0; j < testData.length; j++) {
                    testData[j] = films[j];
                }

                // Store the time right before and after calling the sorting method
                long start = System.nanoTime();
                mergeSort(testData, 0, testData.length);
                long end = System.nanoTime();

                // Store the elapsed time in nanoseconds
                totalTime += (end - start);
            }
            // Calculate the average time given the 3 runs and the total elapsed time
            double avgTime = totalTime / runs;
            // Print the size of the list and average time spent to sort it
            System.out.println("\nSize: " + size + "\tAvg Time: " + avgTime + " nanoseconds");
        }
    }

    // Helper method to print films
    public static void printFilms(Film[] films) {
        for (Film film : films) {
            System.out.println(film);
        }
    }
}

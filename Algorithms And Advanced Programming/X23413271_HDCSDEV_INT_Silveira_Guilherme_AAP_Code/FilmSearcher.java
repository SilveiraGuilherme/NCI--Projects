public class FilmSearcher {
    public static void searchByTitle(Film[] films, String title) {
        int lowerB = 0;
        int upperB = films.length - 1;
        int foundIndex = -1;

        // Perform binary search on the sorted array to locate one occurrence of the
        // title
        while (upperB >= lowerB) {
            int mid = (lowerB + upperB) / 2;
            int compare = title.compareToIgnoreCase(films[mid].getTitle());

            if (compare == 0) {
                foundIndex = mid;
                break;
            } else if (compare < 0) {
                upperB = mid - 1;
            } else {
                lowerB = mid + 1;
            }
        }

        // When we find the targeted title, we need to check if there are duplicated
        // titles. Since the list is sorted, the similar titles will be to the left
        // and/or right of the title found. Therefore, we check for similarity on both
        // sides.
        if (foundIndex != -1) {
            // Search titles to the left
            int left = foundIndex - 1;
            while (left >= 0 && films[left].getTitle().equalsIgnoreCase(title)) {
                left--;
            }

            // Search titles to the right
            int right = foundIndex + 1;
            while (right < films.length && films[right].getTitle().equalsIgnoreCase(title)) {
                right++;
            }

            // Print all films with the matching title found between left+1 and right-1
            for (int i = left + 1; i < right; i++) {
                System.out.println(films[i]);
            }
        } else {
            System.out.println("Not an existing film title");
        }
    }

    // Analyzing the time it takes to find a movie title within various list sizes
    public static void searchTimeAnalysis(Film[] films, String title) {
        // Declare an array with all the sizes to be tested
        int[] sizes = { 10, 100, 1000, 5000, 10000 };
        System.out.println("=============== Search Time Complexity ===============");

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
                searchByTitle(testData, title);
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
}

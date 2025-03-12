public class Sorting {
    public void strMergeSort(String[] f, int lowerB, int upperB) {
        if (lowerB + 1 < upperB) {
            int mid = (upperB + lowerB) / 2;
            strMergeSort(f, lowerB, mid);
            strMergeSort(f, mid, upperB);
            strMerge(f, lowerB, mid, upperB);
        }
    }

    public void strMerge(String f[], int lowerB, int mid, int upperB) {
        int i = lowerB;
        int j = mid;
        String temp[] = new String[upperB - lowerB];
        int t = 0;
        while (i < mid && j < upperB) {
            if (f[i].charAt(0) <= f[j].charAt(0)) {
                f[t] = f[i];
                i++;
                t++;
            } else {
                f[t] = f[j];
                j++;
                t++;
            }
        }
        while (i < mid) {
            f[t] = f[i];
            i++;
            t++;
        }
        while (j < upperB) {
            f[t] = f[j];
            j++;
            t++;
        }
        i = lowerB;
        t = 0;
        while (t < temp.length) {
            f[i] = f[t];
            i++;
            t++;
        }
    }
}

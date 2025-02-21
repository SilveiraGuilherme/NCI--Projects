public class RecursiveExamples {
    public static void main(String[] args) {
        
        // int factorN = factorial(15);
        
        // System.out.println(factorN);

        //printStar(5);

        int [] data = {1, 10, 200, 50}; // sum should be 261

        // int sum = computeArraySum(data, 0);

        // System.out.println(sum);

        // boolean found = searchArray(data, 0, 1000);

        // System.out.println(found);

        int fibNum = fibRecursive(6);

        int fibNumIt = fibIterative(6);

        System.out.println("recursive:" + fibNum);
        System.out.println("iterative:" + fibNumIt);
    }
        
    private static int factorial(int n) {
        
        if(n==0){
            return 1;
        }
        else if(n < 1){
            return -1; 
        }
        else{
            return n * factorial(n-1);
        }
    }

    public static void printStar(int n){

        System.out.print("*");
        if(n==1){
            return;
        }
        else{
            printStar(n-1);
        }

    }

    // assume that index starts at 0
    public static int computeArraySum(int [] data, int index){
        if(index >= data.length){
            return 0;
        }
        else{
            return data[index] + computeArraySum(data, index + 1);
        }
    }

    public static boolean searchArray(int [] data, int index, int query){
        if(index >= data.length){
            return false;
        }
        else if(data[index] == query){
            return true;
        }
        else{
            return searchArray(data, index+1, query);
        }
    }

    public static int fibRecursive(int n){

        if(n==1 || n==2){
            return 1;
        }
        else{
            return fibRecursive(n-1) + fibRecursive(n-2);
        }

    }
    
    public static int fibIterative(int n){


        int  [] data = new int[n];
        data[0] = 1;
        data[1] = 1;

        for(int nth=2; nth < n; nth++){
            data[nth] = data[nth-1] + data[nth-2];
        }

        return data[n-1];

    } 
}

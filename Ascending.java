import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ascending {
    public static void main(String[] args) {
        int N = StdRandom.uniformInt(10); //random array size between 0 to 10
        Double[] arr = new Double[N];
        for(int i = 0; i < N; i++){
            arr[i] = StdRandom.uniform(); //random array elements between 0 to 1
        }
        
        Insertion.sort(arr); //sorts arr elements from lowest to highest

        for(int i = 0; i < N; i++){
            StdOut.println(arr[i]); //prints all elements of array
        }
    }
}

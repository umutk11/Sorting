import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class StringSorter {
    public static void main(String[] args) {
        String[] in = StdIn.readAllStrings(); //reads all string inputs from user and creates an array from them
        Insertion.sort(in); //sorts elements of arrays

        for(int i = 0; i < in.length; i++){ 
            StdOut.println(in[i]); //prints every element of array
        }
    }
}

import java.nio.charset.MalformedInputException;

import edu.princeton.cs.algs4.StdOut;

public class Selection /*implements Comparable<Integer>*/ {
    //compares 2 elements. if v is less than w, returns true(compareTo returns -1)
    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    //changes positions of 2 elements
    private static void exch(Comparable[] arr, int i, int j){
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //
    private static void sort(Comparable[] arr){
        int len = arr.length;
        for(int i = 0; i < len; i++){
            int min = i; //pointer moves to the right 
            for(int j = i; j < len; j++){  //find index of smallest element on right of the pointer
                if(less(arr[j], arr[min]) == true){
                    min = j;
                }
            }
        exch(arr, i, min); //if inner loop returns true, changes positions of indexes i and j
        }
    }

    public static void main(String[] args) {
        Comparable[] a = new Comparable[]{10, 3, 47, 8, 30};
        sort(a);
        System.out.println(a[2]);
    }
}

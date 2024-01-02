// To sort a randomly-ordered array with distinct keys, insertion sort uses ~ 1⁄4 N 2 compares and ~ 1⁄4 N 2 exchanges on average.

public class Insertion {
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
    // Moving from right to left, exchange a[i] with each larger entry to its left
    public static void sort(Comparable[] arr){
        int len = arr.length;
        for(int i = 0; i < len; i++){
            for(int j = i; j > 0; j--){
                if(less(arr[j], arr[j-1])){
                    exch(arr, j, j-1);
                }
                else break;
            }
        }
    }

    public static void main(String[] args) {
        Comparable[] a = new Comparable[]{10, 3, 47, 8, 30};
        sort(a);
        System.out.println(a[2]);
    }
}

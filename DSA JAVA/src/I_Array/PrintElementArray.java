package I_Array;

public class PrintElementArray {
    public static void printElementArray(int arr[], int size ) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={ 1, 2, 3, 4};
        int size= arr.length;
        printElementArray(arr, size);
    }

}
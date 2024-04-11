package N_Sorting;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current=arr[i];
            int j= i-1;
            while (j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
               j= j-1;
            }
            arr[j+1]=current;
        }
    }
    public static void printArray(int[] arr) {
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    void sort(int arr[]){
        for(int i=1; i< arr.length; i++){
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={5, 6, 8, 4, 1, 2, 7, 3, 9, 10};

        insertionSort(arr);
        printArray(arr);
    }
}

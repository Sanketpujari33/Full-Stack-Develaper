package Sorting;

public class QuickSort {
    public static void quickSort(int arr[], int low, int high){
        if(low<high){
            int pidx=partition(arr,low,high);
            quickSort(arr,low,pidx-1);
            quickSort(arr,pidx+1,high);
        }
    }
    public static int partition(int arr[], int low, int high) {
            int pivot=arr[high];
            int i=low;
            int j=low;
            while (i<=high) {
                if(arr[i]<=pivot){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    j++;
                }
                i++;
            }
        return j-1;
    }
        public static void main(String[] args) {
        int arr[]={ 6, 3, 9, 5, 2, 8};
        int size= arr.length;
        quickSort(arr,0, size-1);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

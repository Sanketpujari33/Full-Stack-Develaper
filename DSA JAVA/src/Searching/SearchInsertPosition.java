package Searching;

public class SearchInsertPosition {
    public static int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target <arr[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6};
        int target=5;
        System.out.println(searchInsert(arr, target));

    }
}

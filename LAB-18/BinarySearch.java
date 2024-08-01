public class BinarySearch {
    public static void main(String[] args) {
        int key = 9;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int n = arr.length;

        int low = 0;
        int high  = n-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == key){
                System.out.println("Element found at index: "+mid);
                return;
            }
            else if(arr[mid] > key){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println("not available");
    }
}

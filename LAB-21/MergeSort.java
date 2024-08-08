import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int [] a = {2,5,2,7,3,8,9,1};
        int n = a.length;

        Divide(a, 0 , n-1);

        for(int i = 0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void Divide(int [] a, int low, int high){
        if(low>=high){
            return;
        }
        int mid = (high+low)/2;

        Divide(a, low, mid);
        Divide(a, mid+1, high);
        Merge(a,low,mid,high);
    }

    public static void Merge(int [] a,int low, int mid, int high){
        int left = low;
        int right = mid+1;
        ArrayList <Integer> temp = new ArrayList<>();

        while(left <= mid && right <= high){
            if(a[left] <= a[right]){
                temp.add(a[left]);
                left++;
            }
            else{
                temp.add(a[right]);
                right++;
            }
        } 

        while(left<=mid){
            temp.add(a[left++]);
        }

        while(right <= high){
            temp.add(a[right++]);
        }

        for (int i = 0; i < temp.size(); i++) {
            a[low + i] = temp.get(i);
        }
    }   
}
public class InsertionSort {
    public static void main(String[] args) {
        int [] a = {3,6,9,1,4,7};
        int n = a.length;
        
        insertion(a,n);
    }

    public static void insertion(int a[], int n){
        for(int i =0; i<n; i++){
            int j = i;
            while(j>0 && a[j-1]>a[j]){
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
                j--;
            }
        }

        for(int i = 0; i<n; i++){
            System.out.print(a[i] +" ");
        }
    }
}

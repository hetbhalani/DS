public class selectionSort {
    public static void main(String[] args) {
        int n = 5;
        int ar [] = {1,34,5,67,12};

        for(int i = 0; i<n-1; i++){
            int min = i;
            for(int j = i+1; j<n; j++){
                if(ar[j] < ar[min]){
                    min = j;
                }
                int temp = ar[i];
                ar[i] = ar[min];
                ar[min] = temp;
            }
        }


        for(int i = 0; i<n; i++){
            System.out.print(ar[i]+" ");
        }
    }    
}

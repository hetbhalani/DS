public class BubbleSort {
    public static void main(String[] args) {
        int a [] = {12,1,23,4,35,5};
        int n = a.length;

        for(int i = n-1; i>1; i--){
            for(int j = 0; j<i; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for(int i = 0; i<n; i++){
            System.out.print(a[i] + " ");
        }
    }
}

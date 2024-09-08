public class ShellSort {
    public static void main(String[] args) {
        int [] a = {4,6,3,2,5,1};
        int n = a.length;

        for(int gap = n/2; gap > 0; gap/=2){
            for(int j = gap; j<n; j++){
                for(int i = j-gap; i>=0; i-=gap){
                    if(a[i+gap] > a[i]){
                        break;
                    }
                    else{
                        int temp = a[i+gap];
                        a[i+gap] = a[i];
                        a[i] = temp;
                    }
                }
            }
        }

        for(int i = 0; i<n; i++){
            System.out.print(a[i]);
        }
    }

}

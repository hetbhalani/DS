class QueueClass{
    int r;
    int f;
    int [] arr;
    int n;

    QueueClass(int n){
        this.f = -1;
        this.r = -1;
        this.n = n;
        arr = new int[n];
    }

    public void EnQueue(int x){
        if(r >= n){
            System.out.println("overflow");
            return;
        }
        if(r==-1 && f == -1){
            f++;
            r++;
        }

        arr[r++] = x;
        
    }

    public int DeQueue(){
        if(r == f && f == 0){
            System.out.println("underflow");
            return -1;
        }
        else{
            int y = arr[++f];
            return y;
        }
    }

    public void printData(){
        if(f == -1 && r == -1){
            return;
        }
        System.out.println();

        for(int i = f; i<r; i++){
            System.out.println(arr[i]);
        }
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        QueueClass q1 = new QueueClass(5);

        q1.EnQueue(10);
        q1.EnQueue(9);
        q1.EnQueue(8);
        q1.EnQueue(7);
        q1.EnQueue(6);
        q1.EnQueue(5);
        q1.EnQueue(4);

        q1.printData();

        System.out.println();
       System.out.println("DeQueued: "+q1.DeQueue());
       System.out.println("DeQueued: "+q1.DeQueue());

    }   
}
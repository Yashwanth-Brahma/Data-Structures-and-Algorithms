package sorting;

public class Quick_sort {
    int partition(int a[],int start,int end){
        int pivot=a[end];
        int pindex=start;
        for(int i=start;i<end;i++){
            if(a[i]<=pivot){
                int temp=a[i];
                a[i]=a[pindex];
                a[pindex]=temp;
            }
            pindex++;
        }
        int temp=a[start];
        a[start]=a[pindex];
        a[pindex]=temp;
        return pindex;
    }

    void quickSort(int a[],int start,int end){
        if(start<end){
            int p=partition(a,start,end);
            quickSort(a,start,p-1);
            quickSort(a,p+1,end);
        }
    }

    public static void main(String args[]){
        Array r=new Array();
        Quick_sort q=new Quick_sort();
        r.getData();
        q.quickSort(r.a,0,r.n-1);
        r.display(r.a,r.n);
    }
}

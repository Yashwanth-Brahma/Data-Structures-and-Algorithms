package sorting;

public class Merge_Sort {
    void merge(int a[],int start,int mid,int end){
        int temp[]=new int[end-start+1];
        int i=start,j=mid+1,k=0;

        while(i<=mid && j<=end){
            if(a[i]<=a[j]){
                temp[k++]=a[i++];
            }else {
                temp[k++]=a[j++];
            }
        }

        while(i<=mid){
            temp[k++]=a[i++];
        }

        while (j<=end){
            temp[k++]=a[j++];
        }

        for(i=start;i<=end;i++){
            a[i]=temp[i-start];
        }
    }

    void mergeSort(int a[],int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            mergeSort(a,start,mid);
            mergeSort(a,mid+1,end);
            merge(a,start,mid,end);
        }
    }

    public static void main(String args[]){
        Array r=new Array();
        Merge_Sort m=new Merge_Sort();
        r.getData();
        m.mergeSort(r.a,0,r.n-1);
        System.out.println("Sorted array");
        r.display(r.a,r.n);
    }
}

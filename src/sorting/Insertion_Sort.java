package sorting;

public class Insertion_Sort {
    void insertionSort(int a[],int n){
        for(int i=0;i<n;i++){
            int temp=a[i];
            int j=i;
            while(j>0 && temp<a[j-1]){
                a[j]=a[j-1];
                j=j-1;
            }
            a[j]=temp;
        }
    }

    public static void main(String args[]){
        Array r=new Array();
        Insertion_Sort i=new Insertion_Sort();
        r.getData();
        i.insertionSort(r.a,r.n);
        System.out.println("Sorted array");
        r.display(r.a,r.n);
    }
}

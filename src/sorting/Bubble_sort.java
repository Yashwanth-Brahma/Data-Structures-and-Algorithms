package sorting;

public class Bubble_sort {
    void bubbleSort(int a[],int n){
        for(int k=0;k<n-1;k++){
            for(int i=0;i<n-k-1;i++){
                if(a[i]>a[i+1]){
                    int temp = a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
    }

    public static void main(String args[]){
        Array r=new Array();
        Bubble_sort b=new Bubble_sort();
        r.getData();
        b.bubbleSort(r.a,r.n);
        System.out.println("Sorted array");
        r.display(r.a,r.n);
    }

}

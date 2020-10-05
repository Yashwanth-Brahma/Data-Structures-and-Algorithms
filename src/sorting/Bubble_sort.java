package sorting;

public class Bubble_sort {
    void bubbleSort(int a[],int n){
        for(int k=0;k<n-1;k++){
            // (n-k-1) is for ignoring comparisons of elements which have already
            // been compared in earlier iterations
            for(int i=0;i<n-k-1;i++){
                if(a[i]>a[i+1]){    //Swapping
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

//Bubble sort is based on the idea of repeatedly comparing pairs of adjacent elements and then swapping their
//positions if they exist in the wrong order.
//Complexity:
//        The complexity of bubble sort is o(n square)in both worst and average cases, because the entire array needs to be
//        iterated for every element.
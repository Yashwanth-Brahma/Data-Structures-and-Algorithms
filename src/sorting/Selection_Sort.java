package sorting;

public class Selection_Sort {
    void selectionSort(int a[],int n){
        // temporary variable to store the position of minimum element
        int min;

        // reduces the effective size of the array by one in  each iteration.
        for (int i=0;i<n-1;i++){

            // assuming the first element to be the minimum of the unsorted array.
            min =i;

//            gives the effective size of the unsorted  array
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min])
                    min=j;
            }

            // putting minimum element on its proper position.
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }
    public static void main(String arga[]){
        Array r=new Array();
        Selection_Sort s=new Selection_Sort();
        r.getData();
        s.selectionSort(r.a,r.n);
        System.out.println("Sorted array");
        r.display(r.a,r.n);
    }
}

//    The Selection sort algorithm is based on the idea of finding the minimum or maximum element in an unsorted
//        array and then putting it in its correct position in a sorted array.
//To find the minimum element from the array of n elements, n-1 comparisons are required. After putting
//        the minimum element in its proper position, the size of an unsorted array reduces to n-1 and then n-2
//        comparisons are required to find the minimum in the unsorted array.
//Therefore (n-1) + (n-2) +...... +1 = (n(n-1))/2 comparisons and n swaps result in the overall complexity
// of O(n square).
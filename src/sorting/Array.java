package sorting;

import java.util.Scanner;

public class Array {
    int a[];
    int n;

    void getData(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of ele");
        n=s.nextInt();
        a=new int[n];
        System.out.println("Enter the "+n+" elements");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
    }

    void display(int a[],int n){
        for(int i=0;i<n;i++)
            System.out.println(a[i]);
    }
}

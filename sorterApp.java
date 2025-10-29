package musterrrs.SorterApp.linkedlist;

import java.util.Arrays;

public class sorterApp {


    public void insertionSort ( int[] x) {
        for (int i = 0; i<x.length; i++) {
            int temp = x[i];
            int j = i-1;
            while (j>= 0 && x[j] > temp ) {
                x[j+1] = x[j];
                j = j-1;

            }
            temp = x[j+1];
            System.out.println(i + " ; " + Arrays.toString(x));
        }
    }

    public void bubbleSort (int [] x ) {
        int n = x.length;
        for (int i = 0; i<n-1; i++) {
            for (int j = 0; j<n-i-1; j++) {
                if (x[j] > x[j+1]){
                    int temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }

            System.out.println((i+1) + " ; " + Arrays.toString(x));
        }

    }

    public void mergeSort (int a[] ) {
        if (a == null || a.length<= 1) {
            return;
        }
        mergeSortrecursive(a , 0 , a.length -1);

    }
    private void mergeSortrecursive(int[] a , int l , int r) {
        if (l>=r) {
            return;
        }
        int m = l + (r - l) / 2;
       mergeSortrecursive(a, l, m);
        mergeSortrecursive(a, m + 1, r);
        mergeSort(a, l, m, r);

    }

    private void mergeSort(int[] a , int l , int m , int r) {
        int mid = a.length/2;
        int[] L = Arrays.copyOfRange(a , 0 , mid);
        int [] R = Arrays.copyOfRange(a , mid , a.length);

        int i = 0; int j=0;
        int k = l;
        while (i<mid && j<a.length) {
            if (L[i]<= R[j]){
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while (i<mid) {
            a[k] = L[i];
            i++;
            k++;
        }
        while (j<a.length) {
            a[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64,34,61,28,22,11,90};

        System.out.println("Vor dem Sortieren");
        System.out.println(Arrays.toString(numbers));
        System.out.println();


        System.out.println("#### BubbleSort ####");
        sorterApp x = new sorterApp();
        x.bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println();

        int[] numbers1 = {54,31,61,28,9,75,92};
        System.out.println("Vor dem Sortieren");
        System.out.println(Arrays.toString(numbers1));
        System.out.println();
        System.out.println("#### InsertionSort ####");
        x.insertionSort(numbers1);
        System.out.println(Arrays.toString(numbers1));


        int[] numbers2 = {51,48,61,14,3,66,89};
        System.out.println("Vor dem Sortieren");
        System.out.println(Arrays.toString(numbers2));
        System.out.println("#### MergeSort ####");
        x.mergeSort(numbers2);
        System.out.println(Arrays.toString(numbers2));
    }
}

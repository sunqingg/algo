package sun.algo;

import java.lang.reflect.Array;
import java.lang.reflect.Member;
import java.util.Arrays;

public class Merge {
    public void mergeProcess(int[] arr,int L,int R) {
        if (L == R) return;
        if (L > R) {
            System.out.println("值不规范");
            System.exit(1);
        }
        int m = L + R >>1;
        mergeProcess(arr,L,m);
        mergeProcess(arr,m+1,R);
        mergeSort(arr,L,m,R);

    }
    public static void mergeSort(int[] arr,int L,int m,int R) {
        int[] res = new int[R-L+1];
        int i=0;
        int p1 = L,p2 = m+1;
        while (p1 <= m && p2 <= R){
            res[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];

        }
        while (p2 <= R) {
            res[i++] = arr[p2++];
        }
        while (p1 <= m) {
            res[i++] = arr[p1++];
        }
        for (int j = 0; j < res.length; j++) {
            arr[L+j] = res[j];
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,54,6,7,43,3,3,6,7,31,543,5,65,76,6,6,654,65,7865,9};
        new Merge().mergeProcess(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

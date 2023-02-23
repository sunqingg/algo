package sun.algo;

import java.util.Scanner;

//  二分法
public class solution {
    public static void searchInseart(int[] arr, int num) {
        if (arr.length < 2) System.out.println("不用排序");
        int m = arr.length >> 1;
        while (num != arr[m]) {
            if (num > arr[m]) {
                m = (m + arr.length) >> 1;
            }
            if (num < arr[m]) {
                m = (int)m >> 1;

            }
        }
        System.out.println("== ：" + m);

    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        Scanner x = new Scanner(System.in);
        System.out.println("请输入一个数");
        int i = x.nextInt();
        searchInseart(a, i);
    }
}
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            new Solution().mergeSort(arr, 0, arr.length - 1);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l==r){
            return ;
        }
        int m=l+(r-l)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
    }



    public static int[] merge(int[] a, int s, int m, int e) {
        int[] temp = new int[e - s + 1];  // Create temp array to hold merged elements
        int p1 = s, p2 = m + 1, p3 = 0;

        // Merge two sorted subarrays
        while (p1 <= m && p2 <= e) {
            if (a[p1] < a[p2]) {
                temp[p3++] = a[p1++];
            } else {
                temp[p3++] = a[p2++];
            }
        }

        // Copy remaining elements from first subarray
        while (p1 <= m) {
            temp[p3++] = a[p1++];
        }

        // Copy remaining elements from second subarray
        while (p2 <= e) {
            temp[p3++] = a[p2++];
        }

        // Copy back merged elements into original array in the correct range
        for (int j = 0; j < temp.length; j++) {
            a[s + j] = temp[j];
        }
        return a;
    }
}


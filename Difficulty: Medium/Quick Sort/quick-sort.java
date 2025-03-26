//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().quickSort(arr, 0, n - 1);
            printArray(arr);
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        // code here
        if(low>=high){
            return;
        }
        int p= partition(arr,low,high);
        quickSort(arr,low,p-1);
        quickSort(arr,p+1,high);
        
    }

    static int partition(int arr[], int low, int high) {
        // your code here
        int p1=low+1;
        int p2=high;
        while(p1<=p2){
            if(arr[p1]<=arr[low]){
                p1++;
            }
            else if(arr[p2]>arr[low]){
                p2--;
            }
            else{
                swap(arr,p1,p2);
            }
        }
        swap(arr,low,p2);
        return p2;
    }
     static void swap(int arr[] ,int low, int high){
         int temp=arr[low];
         arr[low]=arr[high];
         arr[high]=temp;
     }
}

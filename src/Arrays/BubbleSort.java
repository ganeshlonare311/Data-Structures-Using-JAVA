package Arrays;

import java.util.Scanner;

public class BubbleSort {
    public static int[] SortArray(int[] arr){
        // Iterate through the array elements
        for(int i=0;i<arr.length;i++) {
            // Compare each element with subsequent elements
            for(int j=i+1;j< arr.length;j++) {
                // Swap elements if they are in the wrong order
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        // Return the sorted array
        return arr;
    }

    public static void main(String[] args) {
        // Create a Scanner object sc for user input
        Scanner sc = new Scanner(System.in);
        // Prompt user to enter the length of the array
        System.out.println("Enter the length of the array:");
        int n=sc.nextInt();
        // Prompt user to enter the elements of the array
        System.out.println("Enter an array of length " + n +":");
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        // Call SortArray method to sort the array
        SortArray(arr);
        //Close the Scanner
        sc.close();
    }
}

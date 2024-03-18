package Arrays;

import java.util.Scanner;

public class CountOccurrence {

    public static int CountOcc(int[] arr , int key){
        // Initialize a counter for occurrences
        int count=0;
        // Iterate through the array
        for(int i=0;i<arr.length;i++) {
            // Check if the current element equals the key
            if(arr[i]==key){
                // If it does, increment the counter
                count++;
            }
        }
        // Return the total count of occurrences
        return count;
    }

    public static void main(String[] args) {
        // Create a Scanner object sc for user input
        Scanner sc = new Scanner(System.in);
        // Prompt user to enter the length of the array
        System.out.println("Enter the length of the array:");
        int n=sc.nextInt();
        // Prompt user to enter the elements of the array
        if(n>0) {
            System.out.println("Enter an array of length " + n +":");
        }
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        // Prompt user to enter the key to find
        System.out.println("Enter the key to find:");
        int key=sc.nextInt();
        // Call CountOcc method to count the number of occurrence in an array and store it in ans variable
        int ans=CountOcc(arr,key);
        //print the occurrence of the key
        System.out.println(ans);
        // Close the scanner
        sc.close();
    }
}

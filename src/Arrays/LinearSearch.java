package Arrays;

import java.util.Scanner;

public class LinearSearch {

    // Method to find the key in the array
    public static void FindKey(int[] arr , int key){
        // Initialize variable to store the index of the key
        int ans=-1;
        // Iterate through the array
        for(int i=0;i<arr.length;i++){
            // If the current element is equal to the key, update the index
            if(arr[i]==key){
                ans=i;
            }
        }
        // Check if the key was found
        if(ans==-1){
            // If key not found, print appropriate message
            System.out.println("The key is not found in the array.");
        }else{
            // If key found, print its location
            System.out.println("The key is found at " + ans + " Location.");
        }
        return;
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
        // Prompt user to enter the key to find
        System.out.println("Enter the key to find:");
        int key=sc.nextInt();
        // Call findKey method to search for the key in the array
        FindKey(arr,key);
        // Close the scanner
        sc.close();
    }
}

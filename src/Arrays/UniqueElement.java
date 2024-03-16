package Arrays;

import java.util.Scanner;

public class UniqueElement {

    public static int uniqueElement(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int Ans=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=-1){
                Ans=arr[i];
                break;
            }
        }
        return Ans;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Array size");
        int n=sc.nextInt();
        System.out.println("Enter an array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Unique element of an array is "+ uniqueElement(arr));
    }
}
/*Challenge 4 – Binary Search

Write a program that implements the binary search algorithm to search for a
specific element in a sorted array. The program should allow the user to input a
target element and then search for that element in the sorted array. It should
return the index of the element if found or indicate that the element is not in
the array.
*/

import java.util.*;

public class Main {

    static int binarySeatch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                System.out.print("The Target element " + target + " is found at index: ");
               return mid;
            }
        }
        System.out.print("Sorry!! the target element is not present in the given array: ");
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.print("Please provide a sorted array : ");
        int arr[] = new int[n];
        for(int i = 0; i <arr.length;i++){
            arr[i] =  sc.nextInt();
        }
        System.out.print("Provide a target element: ");
        int target = sc.nextInt();
        int ans = binarySeatch(arr, target);
        System.out.println(ans);

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble_sort;

/**
 *
 * @author HP
 */
public class Bubble_sort {
static void bubbleSort(int[]arr){
    int n=arr.length;
    int temp=0;
    for(int i=0;i<n;i++){
        for(int j=1;j<(n-1);j++){
            if(arr[j-1]>arr[j]){
                temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
        }
    }
}
   
    public static void main(String[] args) {
        int arr[]={3,76,98,345,717,100,43};
        System.out.println("array before bubble sort");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("array after bubble sort");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        }
    }
    


package com.day16.bl;

import java.util.Scanner;

class Demo{
    int a[] = new int[5];
    void accept() {
        System.out.println("Enter array elements:");
        Scanner s1 = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = s1.nextInt();
        }
    }
    void display() {
        System.out.println("Array elements are:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Element is" + a[i]);
        }
    }

/*

searchkey = 20;
0  1  2  3  4  5
[10,20,30,40,50,60]
   start = 0;
   end = 5;
   mid = (start + end)/2    
*/

    void binarySearchExample(int searchKey){
        int start = 0;
        int end = a.length;
        int mid = (start + end) / 2;  // 3

        while(start <= end){
            
            if(a[mid] < searchKey){
                    start = mid + 1;
            }else if(a[mid] == searchKey){
                System.out.println("Elemnt is found at "+mid);
                break;
            }else{
                end = mid - 1;
            }

            mid = (start + end)/2;

        }
        if(start > end){
            System.out.println("Elemnt is not found");
        }
    }
}
public class BinarySearch {

    public static void main(String ar[]) {
        Demo b1 = new Demo();
        b1.accept();
        b1.display();
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter search key");

        int searchKey;
        searchKey = s1.nextInt();
        b1.binarySearchExample(searchKey);
    }   
}
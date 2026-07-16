package Lab;
import utils.Validation;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        int n ;
        n = (int)Validation.getValidDouble("Mời bạn nhập số nguyên dương bất kỳ: ",0,true);

        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = (int)Validation.getValidDouble(String.format("Mời bạn nhập số thứ %d: ",i+1),true);
        }
        System.out.format("\nMảng ban đầu: %s",Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.format("\nMảng sau khi sắp xếp: %s",Arrays.toString(arr));
        System.out.format("\nPhần tử nhỏ nhất là: %d ",arr[0]);
        System.out.format("\nPhần tử lớn nhất là: %d",arr[n-1]);


    }


    static void printMultipleTable(int n){
        for(int i = 1;i<=10;i++){
            System.out.format("\n %d * %d = %d",n,i,n*i);
        }
    }

   static boolean isPrime(int n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i*i<=n;i+=2){
            if(n % i == 0) return false;
        }
        return true;
    }
}

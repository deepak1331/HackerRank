package com.hackerRank.Day10;
import java.util.Scanner;

public class Solution {
    
    public static String binary(int n){
        StringBuilder sb = new StringBuilder();
        
        while(n>0){
            sb.append(n%2);
            n /= 2;
        }
        return sb.toString();
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
         int maxOneCount=0;
        int oneCount=1;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String binaryString=null;
        if(n>0 && n< 1000000)
       binaryString=binary(n);        
     
    // System.out.printf("Binary of %d is : %s", n, binaryString);
       
        for(int i=binaryString.length()-1;i>0;i--){
            if(binaryString.charAt(i)=='1' && binaryString.charAt(i-1)=='1'){
                oneCount++;
            }
            else if(binaryString.charAt(i)=='1' && binaryString.charAt(i-1)=='0'){
               
                //reset oneCount to 1;
                oneCount=1;
            }
            if(maxOneCount<oneCount)
                maxOneCount=oneCount;
        }
        System.out.println(maxOneCount);
        scanner.close();
    }
}
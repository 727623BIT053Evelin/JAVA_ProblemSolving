package com.evelin;
import java.util.Scanner;
public class FunctionPrimeBetweenRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        primeRange(start,end);
    }
    public static void primeRange(int start,int end){
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
    }
    public static boolean isPrime(int i){
        int c=2;
        if (i <= 1) {
            return false;
        }
        else{
            while(c*c<=i){
                if(i%c==0){
                    return false;
                }
                c++;
            }

        }return true;
    }
}

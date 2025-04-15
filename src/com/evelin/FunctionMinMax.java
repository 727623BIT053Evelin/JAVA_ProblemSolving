package com.evelin;
import java.util.Scanner;
public class FunctionMinMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println("Maximum number="+maxi(a,b,c));
        System.out.println("Minimum number="+mini(a,b,c));

    }
    public static int maxi(int a,int b,int c){
        int max=Integer.MIN_VALUE;
        if(a>b &&a>c){
            max=a;
        }
        else if(b>a && b>c){
            max=b;
        }
        else{
            max=c;
        }
        return max;
    }
    public static int mini(int a,int b,int c){
        int min=Integer.MAX_VALUE;
        if(a<b &&a<c){
            min=a;
        }
        else if(b<a && b<c){
            min=b;
        }
        else{
            min=c;
        }
        return min;
    }
}

package com.evelin;
import java.util.Scanner;
public class Fibanocci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=0;
        int n2=1;
//        System.out.println(n1+" "+n2);
//        int count=2;
//        while(count<n){
//            int n3=n1+n2;
//            n1=n2;
//            n2=n3;
//            System.out.print(n2+" ");
//            count++;
//        }

        for (int i=0;i<n;i++){
            System.out.print(n1+" ");
            int n3=n1+n2;
            n1=n2;
            n2=n3;


        }
    }
}

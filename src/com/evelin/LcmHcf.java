package com.evelin;
import java.util.Scanner;
public class LcmHcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int hCF=hcf(num1,num2);
        int lCM=lcm(num1,num2);
        System.out.println("HCF="+hCF);
        System.out.println("LCM="+lCM);

    }
    public static int hcf(int num1,int num2){
        while(num2>0){        //num2!=0
        int temp=num2;
        num2=num1%num2;
        num1=temp;
        }
        return num1;
    }
    public static int lcm(int num1,int num2){
         return Math.abs(num1*num2)/hcf(num1,num2);       //Math.abs-->(-5)-->5
    }
}

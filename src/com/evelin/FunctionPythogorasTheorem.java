package com.evelin;
import java.util.Scanner;
public class FunctionPythogorasTheorem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
       if( pythogoras(a,b,c)){
           System.out.println("These 3 values form a triplet");
       }
       else{
           System.out.println("These 3 values do not form a triplet");
       }
    }
    public static boolean pythogoras(int a,int b,int c){
        int x=Math.min(a,Math.min(b,c));//to find minimum
        int z=Math.max(a,Math.max(b,c));//to find maximum
        int y=a+b+c-x-z;//to find the middle element both x&a ,z&c cancelled.
        return Math.pow(x,2)+Math.pow(y,2)==Math.pow(z,2);//x^2 +y^2 =z^2

    }
}

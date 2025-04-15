package com.evelin;
import java.util.Scanner;
public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double b=sc.nextInt();
        double h=sc.nextInt();
        System.out.printf("Area of Parallelogram is %.2f",b*h);
    }
}

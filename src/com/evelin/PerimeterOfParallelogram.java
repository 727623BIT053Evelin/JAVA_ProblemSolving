package com.evelin;
import java.util.Scanner;
public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        System.out.printf("Perimeter of a parallelogram is %.2f",2*(a+b));

    }
}

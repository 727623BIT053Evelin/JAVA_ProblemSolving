package com.evelin;
import java.util.Scanner;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double l=sc.nextInt();
        double b=sc.nextInt();
        System.out.printf("Perimeter of a rectangle is %.2f",2*(l+b));
    }
}

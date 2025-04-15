package com.evelin;
import java.util.Scanner;
public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextInt();
        double h=sc.nextInt();
        System.out.printf("Volume of a cone is %.2f",(1.0/3)*Math.PI*r*r*h);

    }
}

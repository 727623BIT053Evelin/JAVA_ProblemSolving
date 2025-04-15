package com.evelin;
import java.util.Scanner;
public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextInt();
        System.out.printf("Volume of a Sphere is %.2f",(4.0/3)*Math.PI*r*r*r);
    }
}

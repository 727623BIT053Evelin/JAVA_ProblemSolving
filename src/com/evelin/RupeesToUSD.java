package com.evelin;
import java.util.Scanner;
public class RupeesToUSD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double indianRupees=sc.nextDouble();
        double usRate=82.0;
        double usRupees=indianRupees/usRate;
        System.out.printf("Indian rupees to US Dolar is $%.2f",usRupees);
    }
}

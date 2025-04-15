package com.evelin;
import java.util.Scanner;
public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().trim().charAt(0);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int ans=0;
        switch (ch){
            case '+'->System.out.print(num1+num2);
            case '-'->System.out.print(num1-num2);
            default -> System.out.print("Invalid Operator");
        }
    }
}
//a="hi"
//b="hi"
//then a==b
//n="Evelin"
//m->n...(m points to n)
//then a.equals("Evelin")
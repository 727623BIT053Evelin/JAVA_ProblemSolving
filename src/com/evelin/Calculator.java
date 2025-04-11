package com.evelin;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().trim().charAt(0);
        int ans=0;
        if(ch=='+' || ch=='-' || ch=='*'|| ch=='/'|| ch=='%'){
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            switch (ch){
                case '+':
                    ans=num1+num2;
                    break;
                case '-':
                    ans=num1-num2;
                    break;
                case '*':
                    ans=num1*num2;
                    break;
                case '/':
                    if(num2!=0) {
                        ans = num1 / num2;
                        break;
                    }
                    else{
                        System.out.print("Number 2 cannot be 0");
                        return;
                    }
                case '%':
                    if (num2 != 0) {
                        ans = num1 % num2;
                        break;
                    }
                    else{
                        System.out.print("Number 2 cannot be 0");
                        return;
                    }
                default:
                    System.out.print("Invalid Operator");


            }
        }
        System.out.print(ans);

    }
}

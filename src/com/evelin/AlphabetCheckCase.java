package com.evelin;
import java.util.Scanner;
public class AlphabetCheckCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().trim().charAt(0);
        if(ch>='A'&&ch<='Z'){
            System.out.println("Upper Case");
        }
        else if(ch>='a'&&ch<='z'){
            System.out.println("Lower Case");
        }
        else{
            System.out.println("Not an Alphabet");
        }
    }
}

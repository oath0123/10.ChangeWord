package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you letter:");
        String str=scanner.next();
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());


    }
}

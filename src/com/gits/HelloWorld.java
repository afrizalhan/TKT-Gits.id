package com.gits;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int a = input.nextInt();
        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("Hello World");
        } else if (a % 3 == 0){
            System.out.println("Hello");
        } else if (a % 5 == 0) {
            System.out.println("World");
        }
    }
}

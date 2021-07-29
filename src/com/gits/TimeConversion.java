package com.gits;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        //input example: 05:45:00PM
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Waktu : ");
        String time = input.next();
        
        int a1 = (int)time.charAt(1) - '0';
        int a2 = (int)time.charAt(0) - '0';
        int aa = (a2 * 10 + a1 % 10);

        if (time.charAt(8) == 'A') {
            if (aa == 12) {
                System.out.print("00");
                for (int i = 2; i <= 4; i++) {
                    System.out.print(time.charAt(i));
                }
            } else {
                for (int i = 0; i <= 4; i++) {
                    System.out.print(time.charAt(i));
                }
            }
        } else {
            if (aa == 12) {
                System.out.print("12");
                for (int i = 2; i <= 4; i++) {
                    System.out.print(time.charAt(i));
                }
            } else {
                aa = aa + 12;
                System.out.print(aa);
                for (int i = 2; i <= 4; i++) {
                    System.out.print(time.charAt(i));
                }
            }
        }
    }
}

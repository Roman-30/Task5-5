package task5_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int height = readHeight("Enter the height which will be more two. Height = ");

        if (height > 2) {
            printTopTriangle();
            printMiddleTriangle(height);
            printBottomTriangle(height);
        } else {
            System.out.println("Error, height no more two ");
        }
    }

    public static int readHeight(String name) {
        Scanner scn = new Scanner(System.in);
        System.out.print(name);
        return scn.nextInt();
    }

    public static void printTopTriangle() {
        System.out.println("*");
    }

    public static void printMiddleTriangle(int height) {
        for (int i = 1; i < height - 1; i++) {
            System.out.print("|");
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("\\");
        }
    }

    public static void printBottomTriangle(int height) {
        for (int c = 0; c < height; c++) {
            System.out.print((c == 0 || c == height - 1) ? '*' : '-');
        }
        System.out.println();
    }
}
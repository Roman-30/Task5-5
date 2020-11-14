package task5_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int height = readHeight();

        startProgram(height);
    }

    public static int readHeight() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        return scn.nextInt();
    }

    public static void startProgram(int height) {
        if (height >= 3) {
            getTriangle(height);
        } else {
            System.out.println("Error. Enter the height again, which will be more or equal than three");
        }
    }

    public static void getTriangle(int height) {
        for (int i = 0; i < height; i++) {
            printTopTriangle(i);
            printBottomTriangle(i, height);
            printMiddleTriangle(i, height);
        }
    }

    public static void printTopTriangle(int i) {
        if (i == 0) {
            System.out.println("*");
        }
    }

    public static void printMiddleTriangle(int i, int height) {
        if (i > 0 && i < height - 1) {
            System.out.print("|");
            for (int j = 1; j < i; i--) {
                System.out.print(" ");
            }
            System.out.println("\\");
        }
    }

    public static void printBottomTriangle(int i, int height) {
        if (i == height - 1) {
            for (int c = 0; c < height; c++) {
                System.out.print((c == 0 || c == height - 1) ? '*' : '-');
            }
            System.out.println();
        }
    }
}
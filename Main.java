package ru.geekbrains.lesson_b_online;

public class Main {
    public static void main(String[] args) {
        one();
        two();
        three();
        four();
        five();
    }

    private static void one() {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] == 1 ? 0 : 1;
        }

        printArray(arr1);
    }

    private static void two() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3 + 1;
        }

        printArray(array);
    }


    private static void three() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
        }

        printArray(arr);
    }

    private static void four() {

        int[] arr4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, 3, 2, 1};
            int min = arr4[0], max = arr4[0];
            for (int i =1; i < arr4.length; i++) {
                if (arr4[i] > max) {
                    max = arr4[i];
                }
                if (arr4[i] < min) {
                    min = arr4[i];
                }
            }
        System.out.println(min + " " + max);
    }
    private static void five() {

        int size = 10;
        int[][] array = new int[size][size];


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || i+j == size -1) array[i][j] = 1; else array[i][j] = 0;
            }
        }
        printArray(array);
    }
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++)
            printArray(arr[i]);
    }
}
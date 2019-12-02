package com.epam.trainings;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arrayRandom = {70, 79, 98, 13, 75, 96, 24, 36, 88, 85, 47, 85, 56, 32, 5, 69, 86, 45, 82, 66, 88, 23, 62, 36, 79, 30, 66, 15, 57, 95, 71, 76, 25, 36, 57, 50, 19, 38, 42, 23, 57, 99, 63, 16, 91, 54, 68, 80, 47, 55, 100, 38, 24, 22, 34, 4, 36, 38, 18, 65, 36, 13, 40, 37, 12, 52, 50, 63, 80, 35, 20, 82, 13, 99, 80, 94, 88, 38, 61, 80, 60, 73, 17, 89, 73, 90, 72, 56, 82, 35, 93, 71, 61, 63, 74, 86, 94, 27, 29, 14};
        int[] arrayDifficult = {99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] arrayEasy = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        bubbleSort(arrayEasy);
    }

    static void bubbleSort(int[] array) {
        int comparisonsDone = 0;
        int swapsDone = 0;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                printArray(array);
                if (array[i] > array[i+1]) {
                    System.out.println("Swap " + array[i] + " and " + array[i+1]);
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapsDone++;
                    sorted = false;
                } else {
                    System.out.println("No need to change elements " + i + " and " + (i+1));
                }
                comparisonsDone++;
            }
        }
        System.out.println("Array size = " + array.length);
        System.out.println("Comparisons done = " + comparisonsDone);
        System.out.println("Swaps done = " + swapsDone);
    }

    static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println();
    }


}

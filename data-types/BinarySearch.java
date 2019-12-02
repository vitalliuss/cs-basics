package com.epam.trainings;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {19, 20, 26, 48, 55, 64, 75, 89, 91};
        int key = 89;
        int position = binarySearch(sortedArray, key);
        System.out.println(key + " position is " + position);
    }

    static int binarySearch(int[] array, int key){
        int position = 0;
        int left = 0;
        int right = array.length-1;


        while(left <= right){
            int middle = (left + right)/2;
            if(array[middle] == key){
                return middle;
            }

            if(array[middle] < key){
                left = middle + 1;
            }

            if(array[middle] > key){
                right = middle - 1;
            }
        }

        return -1;
    }
}

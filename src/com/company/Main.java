package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1,8,3,3,4,4,9,12};
        enChon(numbers);
        enKichine(numbers);

    }
    static void enChon(int[] numbers){
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("Maximum: " + max);

    }
    static void enKichine(int[] numbers){
        int min  = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("Minimum: " + min);
    }
}

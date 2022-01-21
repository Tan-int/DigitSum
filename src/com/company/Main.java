package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(912));
    }

    public static int sumDigits(int number) {

        // return -1 if the digit is less than 10 or negative
        if (number < 10){
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            // extract the least significant digit
            sum += number % 10;
            //drop the least significant digit
            number /= 10;

        }

        return sum;
    }
}

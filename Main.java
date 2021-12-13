package com.rowland.engineering;

public class Main {

    public static void evenAndOddNumbers(int[] numbers ) {
        int countEven = 0;
        int countOdd = 0;

        for (int i : numbers) {
            if (i % 2 == 0) {
                if (countEven == 0) {
                    System.out.print("Even Numbers ::: ");
                }
                System.out.print(i +" ,");
                countEven++;
            }
        }
        System.out.println();

        for ( int j : numbers) {
            if (j % 2 != 0) {
                if (countOdd == 0) {
                    System.out.print("Odd Numbers ::: ");
                }
                 System.out.print(j +" ,");
                countOdd++;
            }
        }
        System.out.println();

    }
    public static void main(String[] args) {
	// write your code here
        int [] container1 = new int[]{12, 5, 7, 43, 80};
        int [] container2 = new int[]{212, 23,54,21,11,43, 67,1234,21,45, 22};
        evenAndOddNumbers(container1);
        evenAndOddNumbers(container2);
    }
   }

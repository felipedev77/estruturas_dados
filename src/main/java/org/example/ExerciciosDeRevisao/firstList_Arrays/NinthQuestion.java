package org.example.ExerciciosDeRevisao.firstList_Arrays;

import java.util.Scanner;

public class NinthQuestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inputs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = 1;
        for (int j : inputs) {
            result += j * j;
        }
    }
}
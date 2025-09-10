package org.example.ExerciciosDeRevisao.firstList_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FifthQuestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vectorOfNumbers = new int[20];
        int tempOdd = 0;
        int tempEven = 0;
        int[] even = new int[20];
        int[] odd = new int[20];
        for (int i = 0; i < 20; i++){
            System.out.println("Digite o valor número " + (i));
            vectorOfNumbers[i] = input.nextInt();
            if (vectorOfNumbers[i] % 2 == 0){
                even[tempEven] = vectorOfNumbers[i];
                tempEven++;
            } else {
                odd[tempOdd] = vectorOfNumbers[i];
                tempOdd++;
            }
        }
        System.out.println(Arrays.toString(vectorOfNumbers));
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));
    }
}

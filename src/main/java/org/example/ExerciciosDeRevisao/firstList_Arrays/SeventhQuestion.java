package org.example.ExerciciosDeRevisao.firstList_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SeventhQuestion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] valuesOperations = new int[5];
        int tempSum = 0;
        int tempTimes = 1;
        for (int i = 0; i < valuesOperations.length; i++){
            int temporaryValue = i+1;
            System.out.println("Digite o " + temporaryValue + "º valor: " );
            valuesOperations[i] = input.nextInt();
            tempSum += valuesOperations[i];
            tempTimes *= valuesOperations[i];
        }
        System.out.println("Os valores digitados foram: " + Arrays.toString(valuesOperations));
        System.out.println("A soma dos valores digitados é igual a " + tempSum);
        System.out.println("O produto dos produtos digitados é igual a " + tempTimes);

    }
}

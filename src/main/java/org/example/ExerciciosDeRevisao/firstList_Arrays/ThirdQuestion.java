package org.example.ExerciciosDeRevisao.firstList_Arrays;

import java.util.Scanner;

public class ThirdQuestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notas = new double[4];
        double result = 0;
        for (int i = 1; i <= 4; i++) {
            int temp = i-1;
            System.out.println("Digite sua " + i + " nota");
            notas[temp] = input.nextDouble();
        }
        for (int i = 1; i <= 4; i++){
            int temp = i - 1;
            System.out.println("Sua " + i + " nota é " + notas[temp]);
            result += notas[temp];
        }
        System.out.println("A sua média de notas é: "+ result/4);
    }
}

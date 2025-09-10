package org.example.ExerciciosDeRevisao.firstList_Arrays;

import java.util.Scanner;

public class EighthQuestion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] ages = new int[5];
        double[] heights = new double[5];
        int temporaryIndex = ages.length;
        for (int i = 1; i <= 5; i++){
            int realIndex = i - 1;
            System.out.println("Digite a " + i + "ª idade: ");
            ages[realIndex] = input.nextInt();
            System.out.println("Digite a " + i + "ª altura: ");
            heights[realIndex] = input.nextDouble();
        }
        while (temporaryIndex > 0) {
            int realIndex = temporaryIndex - 1;
            System.out.println("A idade da " + temporaryIndex + "ª pessoa é: " + ages[realIndex]);
            System.out.println("A altura da " + temporaryIndex + "ª pessoa é: " + heights[realIndex]);
            temporaryIndex--;
        }
    }
}

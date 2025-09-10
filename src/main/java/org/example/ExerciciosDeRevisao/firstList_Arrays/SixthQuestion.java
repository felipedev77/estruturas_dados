package org.example.ExerciciosDeRevisao.firstList_Arrays;

import java.util.Scanner;

public class SixthQuestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] media = new double[10];
        for (int i = 1; i <= 10; i++){
            int temp = i - 1;
            double note1, note2, note3, note4;
            System.out.println("Informe a 1ª nota do " + i + "º aluno" );
            note1 = input.nextDouble();
            System.out.println("Informe a 2ª nota do " + i + "º aluno" );
            note2 = input.nextDouble();
            System.out.println("Informe a 3ª nota do " + i + "º aluno" );
            note3 = input.nextDouble();
            System.out.println("Informe a 4ª nota do " + i + "º aluno" );
            note4 = input.nextDouble();
            media[temp] = (note1 + note2 + note3 + note4) / 4;

        }
        for (int i = 0; i < media.length; i++) {
            System.out.println("A média do " + (i + 1) + "º aluno é igual a " + String.format("%.2f", media[i]));
        }
    }
}

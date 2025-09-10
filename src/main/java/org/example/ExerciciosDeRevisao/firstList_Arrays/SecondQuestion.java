package org.example.ExerciciosDeRevisao.firstList_Arrays;

public class SecondQuestion {
    public static void main(String[] args) {
        int[] numerosImpares = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        for (int i = numerosImpares.length; i >= 1 ; i--) {
            System.out.print(numerosImpares[i - 1] + " ");
        }
    }
}

package org.example.ExerciciosDeRevisao;

import java.util.Arrays;

public class ExerciciosDeRevisao {
    public static void main(String[] args) {
        //Resposta exercício 1
        int[] numerosPrimos = {2, 3, 5, 7, 11};
        System.out.println(Arrays.toString(numerosPrimos)); //Seria possível utilizar um loop, mas a IDE recomendou esta forma.

        //Resposta exercício 2
        int[] numerosImpares = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        for (int i = numerosImpares.length; i >= 1 ; i--) {
            System.out.print(numerosImpares[i - 1] + " ");
        }

    }
}

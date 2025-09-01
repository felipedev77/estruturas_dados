package org.example.ExerciciosDeRevisao;

import java.util.Arrays;
import java.util.Scanner;

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

        //Resposta exercício 3
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua 1ª nota:");
        double nota1 = input.nextDouble();
        System.out.println("Digite sua 2ª nota:");
        double nota2 = input.nextDouble();
        System.out.println("Digite sua 3ª nota:");
        double nota3 = input.nextDouble();
        System.out.println("Digite sua 4ª nota:");
        double nota4 = input.nextDouble();
        System.out.println("Primeira nota: " + nota1 + "\n" + "Segunda nota: "+ nota2 + "\n" + "Terceira nota: " + nota3
                + "\n" + "Quarta nota: " + nota4);
        System.out.println("A sua média de notas é: "+ (nota1 + nota2 + nota3 + nota4)/4);


        //Respostas exercícios questão 4
        int numbOfConsonants = 0;
        char[] vectorOfCharacters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        for (int i = 0; i < vectorOfCharacters.length; i++){
            if (!isConsonant(vectorOfCharacters[i])){
                numbOfConsonants++;
            }
        }
        System.out.println("A quantidade de consoantes do vetor é: "+ numbOfConsonants);

        //Respostas exercícios questão 5
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
    public static boolean isConsonant(char letter) {
        String vogals = "aeiouAEIOU";
        return vogals.contains(String.valueOf(letter));
    }

}

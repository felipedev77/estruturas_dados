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
        //arrumar isso daqui
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
        for (char vectorOfCharacter : vectorOfCharacters) { if (!isConsonant(vectorOfCharacter)) { numbOfConsonants++; }}
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

        //Resposta dos exercícios questão 6
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

        //Exercícios questão 7

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

        //Exercícios questões 8

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
    public static boolean isConsonant(char letter) {
        String vogals = "aeiouAEIOU";
        return vogals.contains(String.valueOf(letter));
    }

}

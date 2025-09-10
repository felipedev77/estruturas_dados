package org.example.ExerciciosDeRevisao.firstList_Arrays;

public class FourthQuestion {
    public static void main(String[] args){
        int numbOfConsonants = 0;
        char[] vectorOfCharacters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        for (char vectorOfCharacter : vectorOfCharacters) { if (!isConsonant(vectorOfCharacter)) { numbOfConsonants++; }}
        System.out.println("A quantidade de consoantes do vetor é: "+ numbOfConsonants);
    }
    public static boolean isConsonant(char letter) {
        String vogals = "aeiouAEIOU";
        return vogals.contains(String.valueOf(letter));
    }
}

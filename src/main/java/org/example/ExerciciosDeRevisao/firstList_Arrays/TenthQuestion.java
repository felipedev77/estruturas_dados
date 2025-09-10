package org.example.ExerciciosDeRevisao.firstList_Arrays;

import java.util.Arrays;

public class TenthQuestion {
    public static void main(String[] args) {
        String[] namesLOTR = {"Gandalf", "Bilbo", "Frodo", "Aragorn", "Gimil", "Legolas", "Pipin", "Mary", "Theoden", "Faramir"};
        String[] namesStarWars = {"Anakin", "Yoda", "Obi Wan", "C3PO", "R2", "Ham Solo", "Luke", "Chewbacca", "Palpatine", "Jar Jar Binks"};
        String[] allNames = new String[20];
        int even = 0;
        int odd = 0;

        for (int i = 0; i < (namesLOTR.length + namesStarWars.length); i++) {
            int temp = i % 2;
            if (i % 2 == 0 || i == 0) {
                allNames[i] = namesLOTR[even];
                even++;
            } else {
                allNames[i] = namesStarWars[odd];
                odd++;
            }
        }
        System.out.println(Arrays.toString(allNames));
    }
}

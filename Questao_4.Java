
//# Java_Lista_trabalhos
//Questões feitas da 7/15

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tam = 10;
        int[] nums = new int[tam];

        for (int i = 0; i < tam; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < tam; i++) {
            int valor = nums[i];

            System.out.print("Pares até " + valor + ": ");
            for (int cont = 0; cont <= valor; cont += 2) {
                System.out.print(cont + " ");
            }
            System.out.println();
        }
    }
}



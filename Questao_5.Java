//# Java_Lista_trabalhos
//Questões feitas da 7/15

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tam = 10;
        int[] nums = new int[tam];

        for (int i = 0; i < tam; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < tam; i++) {
            int valor = nums[i];

            System.out.print("Divisores de " + valor + ": ");
            for (int cont = 1; cont <= valor; cont++) {
                if (valor % cont == 0) {
                    System.out.print(cont + " ");
                }
            }
            System.out.println();
        }
    }
}




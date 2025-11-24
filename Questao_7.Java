//# Java_Lista_trabalhos
//Questões feitas da 7/15

import java.util.Scanner;

public class Questao7 {

    static int fatorial(int n) {
        int cont = 1;

        for (int i = 1; i <= n; i++) {
            cont = cont * i;
        }

        return cont;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tam = 15;
        int[] nums = new int[tam];
        int[] fats = new int[tam];

        for (int i = 0; i < tam; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < tam; i++) {
            int valor = nums[i];
            fats[i] = fatorial(valor);
        }

        for (int i = 0; i < tam; i++) {
            System.out.print(fats[i] + " ");
        }
    }
}
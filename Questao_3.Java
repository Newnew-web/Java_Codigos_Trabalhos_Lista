//# Java_Lista_trabalhos
//Questões feitas da 7/15

import java.util.Scanner;

public class Questao3 {

    static boolean primo(int n) {
        if (n <= 1) return false;

        for (int cont = 2; cont * cont <= n; cont++) {
            if (n % cont == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tam = 10;
        int[] nums = new int[tam];

        for (int i = 0; i < tam; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < tam; i++) {
            int valor = nums[i];

            if (primo(valor)) {
                System.out.println(valor + " é primo");
            } else {
                System.out.println(valor + " não é primo");
            }
        }
    }
}




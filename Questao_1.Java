//# Java_Lista_trabalhos
//Questões feitas da 7/15

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[20];
        int[] res = new int[20];
        int tam = 20;

        for (int i = 0; i < tam; i++) {
            nums[i] = sc.nextInt();
        }

        int pos = 0;

        for (int i = 0; i < tam; i++) {
            if (nums[i] % 2 == 0) {
                res[pos] = nums[i];
                pos++;
            }
        }

        for (int i = 0; i < tam; i++) {
            if (nums[i] % 2 != 0) {
                res[pos] = nums[i];
                pos++;
            }
        }

        for (int i = 0; i < tam; i++) {
            System.out.print(res[i] + " ");
        }
    }
}


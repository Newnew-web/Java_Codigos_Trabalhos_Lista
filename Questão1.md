# Java_Codigos_Trabalhos_Lista
feito para colocar trabalhos de java da etec

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[20];
        int B[] = new int[20];

        for (int i = 0; i < 20; i++) A[i] = sc.nextInt();

        int pos = 0;

        for (int i = 0; i < 20; i++)
            if (A[i] % 2 == 0)
                B[pos++] = A[i];

        for (int i = 0; i < 20; i++)
            if (A[i] % 2 != 0)
                B[pos++] = A[i];

        for (int i = 0; i < 20; i++) System.out.print(B[i] + " ");
    }
}

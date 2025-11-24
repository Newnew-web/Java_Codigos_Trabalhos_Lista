//# Java_Lista_trabalhos
//Questões feitas da 7/15
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        int tam = 5;

        for (int i = 0; i < tam; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < tam; i++) {
            int valor = nums[i];
            System.out.println("Tabuada de " + valor + ":");
            
            for (int cont = 1; cont <= 10; cont++) {
                System.out.println(valor + " x " + cont + " = " + (valor * cont));
            }

            System.out.println();
        }
    }
}




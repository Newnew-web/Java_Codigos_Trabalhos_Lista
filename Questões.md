# Java_Codigos_Trabalhos_Lista

Questão 1

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

Questão 2

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

Questão 3

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

Questão 4

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

Questão 5

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

Questão 6

    public class Questao6 {
    
        public static void main(String[] args) {
            int tam = 11;
    
            int[] nums = new int[tam];
    
            int mult = 1;
    
            for (int i = 0; i < tam; i++) {
                nums[i] = mult;
                mult = mult * 2;
            }
    
            for (int i = 0; i < tam; i++) {
    
                System.out.println("nums[" + i + "] = " + nums[i]);
            }
        }
    }

Questão 7

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

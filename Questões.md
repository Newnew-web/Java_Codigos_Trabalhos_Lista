# Java_Codigos_Trabalhos_Lista
feito para colar trabalhos de java da etec
# Questão 1


        importar java.util.Scanner;
        
        classe pública Questao1 {
         público estático vazio main(String[] args) {
         Scanner sc = novo Scanner(System.in);
         int A[] = novo int[20];
         int B[] = novo int int B[] = novo int[20];
        
         para (int i = 0; i < 20; i++) A[i] = sc.nextInt();
        
         int pos = 0;
        
         parágrafo (int i = 0; i < 20; i++)
         se (A[i] % 2 == 0)
         B[pos++] = A[i];
        
         parágrafo (int i = 0; i < 20; i++)
         se (A[i] % 2 != 0)(A[i] % 2 != 0)
         B[pos++] = A[i];
        
         para (int i = 0; i < 20; i++) System.out.print(B[i] + " ");
         }}

# Questão  2


    importar java.util.Scanner;
    
    classe pública Questao2 {
     público estático vazio main(String[] args) {
     Scanner sc = novo Scanner(System.in);
     int A[] = novo int[5];
    
         para (int i = 0; i < 5; i++) A[i] = sc.nextInt();
    
         parágrafo (int n: A) {
         System.out.println("Tabuada de " + n + ":");
         parágrafo (int i = 1; i <= 10; i++)
         System.out.println(n + " x " + i + " = " + (n * i));
         Sistema.out.println();
            }
        }}


# Questão 3

    importar java.util.Scanner;
    
    classe pública Questao3 {
    
        booleano estático primo(int n) {
         se (n <= 1) retornar falso;
         para (int i = 2; i <= Math.sqrt(n); i++)
         se (n % i == 0) retornar falso;
         retornar verdejeiro;
        }
    
        público estático vazio main(String[] args) {
         Scanner sc = novo Scanner(System.in);
         int A[] = novo int[10];
    
         para (int i = 0; i < 10; i++) A[i] = sc.nextInt();
    
         parágrafo (int x: A) {
         se (primo(x)) System.out.println(x + "é primo");
         else System.out.println(x + "não é primo");
            }
        }}


# Questão 4


        importar java.util.Scanner;
    
    classe pública Questao4 {
     público estático vazio main(String[] args) {
     Scanner sc = novo Scanner(System.in);
     int A[] = novo int[10];
    
         para (int i = 0; i < 10; i++) A[i] = sc.nextInt();
    
         parágrafo (int n: A) {
         System.out.print("Pares até " + n + ": ");
         parágrafo (int i = 0; i <= n; i += 2)
         System.out.print(i + " ");
         Sistema.out.println();
            }
        }}


# Questão 5

    
     importar java.util.Scanner;
    
    public class Questao5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int A[] = new int[10];
    
            for (int i = 0; i < 10; i++) A[i] = sc.nextInt();
    
            for (int n : A) {
                System.out.print("Divisores de " + n + ": ");
                for (int i = 1; i <= n; i++)
                    if (n % i == 0) System.out.print(i + " ");
                System.out.println();
            }
        }}


# Questão 6


    public class Questao6 {
    
        public static void main(String[] args) {
            int[] A = new int[11];
    
            int potencia = 1; 
    
            for (int i = 0; i < A.length; i++) {
                A[i] = potencia;
                potencia = potencia * 2; // próxima potência
            }
    
            for (int i = 0; i < A.length; i++) {
                System.out.println("A[" + i + "] = " + A[i]);
            }
        }
    }





# Questão 7
    
     import java.util.Scanner;
    
    public class Questao7 {
    
        static int fatorial(int n) {
            int f = 1;
            for (int i = 1; i <= n; i++) f *= i;
            return f;
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            int A[] = new int[15];
            int B[] = new int[15];
    
            for (int i = 0; i < 15; i++) A[i] = sc.nextInt();
    
            for (int i = 0; i < 15; i++)
                B[i] = fatorial(A[i]);
    
            for (int x : B) System.out.print(x + " ");
        }}


# Questão 8

   import java.util.Scanner;

    public class Questao8 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int A[] = new int[10];
            int B[] = new int[10];
    
            for (int i = 0; i < 10; i++) A[i] = sc.nextInt();
    
            for (int i = 0; i < 10; i++) {
                int soma = 0;
                for (int j = 0; j <= i; j++)
                    soma += A[j];
                B[i] = soma;
            }
    
            for (int x : B) System.out.print(x + " ");
        }}

# Questão 9

        import java.util.Scanner;
        
        public class Questao9 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        
                int A[] = new int[10];
                int B[] = new int[10];
                int C[] = new int[10];
                int pos = 0;
        
                for (int i = 0; i < 10; i++) A[i] = sc.nextInt();
                for (int i = 0; i < 10; i++) B[i] = sc.nextInt();
        
                for (int x : A)
                    for (int y : B)
                        if (x == y) {
                            C[pos++] = x;
                            break;
                        }
        
                for (int i = 0; i < pos; i++) System.out.print(C[i] + " ");
            }
    }

# Questão 10


    import java.util.Scanner;
    
    public class Questao10 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            int A[] = new int[10];
            int B[] = new int[10];
            int C[] = new int[10];
            int pos = 0;
    
            for (int i = 0; i < 10; i++) A[i] = sc.nextInt();
            for (int i = 0; i < 10; i++) B[i] = sc.nextInt();
    
            for (int x : A) {
                int contador = 0;
    
                for (int y : B) {
                    if (x != y) contador++;
                }
    
                if (contador == 10) {
                    C[pos++] = x;
                }
            }
    
            for (int i = 0; i < pos; i++)
                System.out.print(C[i] + " ");
        }




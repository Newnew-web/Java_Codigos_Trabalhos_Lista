# Java_Codigos_Trabalhos_Lista
feito para colocar trabalhos de java da etec
```
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
    }}
}
```


    ```
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[5];

        for (int i = 0; i < 5; i++) A[i] = sc.nextInt();

        for (int n : A) {
            System.out.println("Tabuada de " + n + ":");
            for (int i = 1; i <= 10; i++)
                System.out.println(n + " x " + i + " = " + (n * i));
            System.out.println();
        }
    }}
```



```
import java.util.Scanner;

public class Questao3 {

    static boolean primo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[10];

        for (int i = 0; i < 10; i++) A[i] = sc.nextInt();

        for (int x : A) {
            if (primo(x)) System.out.println(x + " é primo");
            else System.out.println(x + " não é primo");
        }
    }}

```





```
    import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[10];

        for (int i = 0; i < 10; i++) A[i] = sc.nextInt();

        for (int n : A) {
            System.out.print("Pares até " + n + ": ");
            for (int i = 0; i <= n; i += 2)
                System.out.print(i + " ");
            System.out.println();
        }
    }}


```

    
    import java.util.Scanner;

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


```


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

```




```
    
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


```

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


```

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

```

```

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
```



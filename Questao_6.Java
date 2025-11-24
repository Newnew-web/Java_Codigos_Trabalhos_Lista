//# Java_Lista_trabalhos
//Questões feitas da 7/15

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




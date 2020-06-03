package testes;

import java.util.Scanner;

public class TesteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] teste = new int[10];
        for (int i = 0; i < teste.length; i++) {
            //teste[i] = Math.random();
            System.out.println("Digite um inteiro:");
            teste[i] = sc.nextInt();
        }

        System.out.println("\nSua array é:\n");
        for(int x : teste) {
            System.out.println(x);
        }
    }
}

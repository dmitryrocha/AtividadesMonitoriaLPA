package testes;

import java.util.Scanner;

public class TesteSubstring {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        changeOne();
        changeTwo();
        changeThree();
    }

    private static void changeThree() {
        System.out.println("Por fim, escreva mais uma frase:");
        String input = sc.nextLine();
        System.out.println("Agora informe uma letra:");
        String padrao1 = sc.nextLine();
        System.out.println("E o outra letra:");
        String padrao2 = sc.nextLine();
        String resultado = input.replaceFirst(padrao1,padrao2);
        System.out.println("Usando replaceFirst: "+resultado);
        resultado = input.replace(padrao1,padrao2);
        System.out.println("Usando replace: "+resultado);
    }

    private static void changeTwo() {
        System.out.println("Agora entre outra frase:");
        String input = sc.nextLine();
        System.out.println("Agora escolha a posição inicial e a final:");
        int inicio = sc.nextInt();
        int fim = sc.nextInt();
        sc.nextLine();
        String resultado = input.substring(inicio);
        System.out.println("Tipo 1 de substring: "+ resultado);
        resultado = input.substring(inicio, fim);
        System.out.println("Tipo 2 de substring: "+ resultado);
    }

    private static void changeOne() {

        System.out.println("Entre a primeira frase:");
        String input = sc.nextLine();
        String resultado = input.toLowerCase();
        System.out.println("Tudo minúsculo: "+resultado);
        resultado = input.toUpperCase();
        System.out.println("Tudo maiúsculo: "+resultado);
        resultado = input.trim();
        System.out.println("trim: "+input.trim());

    }
}

package testes;

import java.util.Scanner;

/*
a) O número de caracteres da string.
b) A string com todas suas letras em maiúsculo.
c) O número de vogais da string.
d) Se a string digitada começa com “UNI” (ignorando maiúsculas/minúsculas).
e) Se a string digitada termina com “RIO” (ignorando maiúsculas/minúsculas).
f) O número de dígitos (0 a 9) da string.
g) Se a string é um palíndromo ou não.

 */

public class ExerciciosString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String input = sc.nextLine();
        letraA(input);
        letraB(input);
        letraC(input);
        letraD(input);
        letraE(input);
        letraF(input);
        letraG(input);


    }

    private static void letraG(String input) {
    }

    private static void letraF(String input) {
        int numerodigitos = 0;
        int inicio = 0;
        int fim = 1;

        for(int x = 0; x < input.length(); x++){
            String letra = input.substring(inicio, fim).toUpperCase();
            if(letra.equals("0") || letra.equals("1") || letra.equals("2") || letra.equals("3") || letra.equals("4") ||
                    letra.equals("5") || letra.equals("6") || letra.equals("7") || letra.equals("8") || letra.equals("9")){
                numerodigitos++;
            }
            inicio++;
            fim++;
        }
        System.out.println("São "+numerodigitos+" dígitos");
    }

    private static void letraE(String input) {
        String palabre = input.toUpperCase();

        if(palabre.substring(input.length()-3,input.length()).equals("RIO")) {
            System.out.println("Termina sim");
        } else {
            System.out.println("Termina não");
        }
    }

    private static void letraD(String input) {
        String palabre = input.toUpperCase();
        if(palabre.substring(0,3).equals("UNI")) {
            System.out.println("Começa sim");
        } else {
            System.out.println("Começa não");
        }

    }

    private static void letraC(String input) {
        int numeroVogais = 0;
        int inicio = 0;
        int fim = 1;

        for(int x = 0; x < input.length(); x++){
            String letra = input.substring(inicio, fim).toUpperCase();
            if(letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")){
                numeroVogais++;
            }
            inicio++;
            fim++;
        }
        System.out.println("São "+numeroVogais+" vogais");
    }

    private static void letraB(String input) {
        System.out.println("Tudo em maiúsculo "+input.toUpperCase());
    }

    private static void letraA(String input) {
        int tamamnho = input.length();
        System.out.println("O tamanho da String é "+tamamnho);
    }
}

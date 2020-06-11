package testes;

import java.util.Random;
import java.util.Scanner;

public class CruzadasGuilherme {
    public static void main(String[] args) {
        obterDados();
    }

    public static void obterDados() {

        Scanner in = new Scanner(System.in);
        String[] palavras = {"ABACAXI", "UNIVERSIDADE", "PALAVRA", "COMIDA", "PROFISSAO", "AMIGO", "CAVALEIRO"};
        String sorteada = random(palavras);
        char[] acertos = new char[sorteada.length()];
        imprimir(sorteada);
        imprimir("\n");

        for (int i = 0; i < 5; i++) {

            char letra = jogada(in);
            validar(letra, sorteada, acertos);
            estrategia(sorteada, acertos);

        }

        in.close();

    }


    public static String random(String[] palavras) {
        // Esse método é responsável por retornar uma palavra aleatória que será usada como a palavra oculta do jogo.
        Random random = new Random();
        int indiceSorteado = random.nextInt(palavras.length); // INDICE DA PALAVRA SORTEADA
        String palavraSorteada = palavras[indiceSorteado]; // VARIAVEL QUE GUARDA A PALAVRA QUE FOI SORTEADA
        return palavraSorteada;
    }

    public static char jogada(Scanner in) {
        imprimir("\nDigite uma letra :");
        char letra = in.next().toUpperCase().charAt(0);
        return letra;
    }

    public static char[] estrategia(String sorteada, char[] acertos) {

        for (int i = 0; i < sorteada.length(); i++) {
            if (acertos[i] == 1) {
                imprimir(" " + sorteada.charAt(i) + " ");
            } else {
                imprimir(" _ ");
            }
        }

        return acertos;

    }


    public static void validar(char letra, String sorteada, char[] acertos) {
        for (int i = 0; i < sorteada.length(); i++) {
            if (letra == sorteada.charAt(i)) {
                acertos[i] = 1;
            } else {
                acertos[i] = 0;
            }
        }
    }

	/*public static boolean ganhouPerdeu (char [] acertos, String sorteada) {

	}*/

    public static void imprimir(char[] vect) {
        imprimir("\n");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }
        imprimir("\n");
    }


    public static void imprimir(String txt) {
        System.out.print(txt);
    }
}

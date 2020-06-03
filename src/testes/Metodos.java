package testes;


import java.util.Scanner;

public class Metodos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int life = 100;
        int opcao = 0;
        System.out.println("O que aconteceu com seu personagem?");

        while(opcao !=4) {
            menu();
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    life = apanhouMuito(life);
                    break;
                case 2:
                    life = apanhouPouco(life);
                    break;
                case 3:
                    life = bebeuLife(life);
                    break;
            }
            System.out.println("Seu life é "+life);

        }
    }

    public static int apanhouMuito(int life) {
        return life-=20;
    }

    public static int apanhouPouco(int life) {
        return life-=5;
    }

    public static int bebeuLife(int life) {
        return life+=10;
    }

    public static void menu() {
        System.out.println("Digite:\n" +
                "1 - Ele apanhou muito\n" +
                "2 - Ele apanhou pouco\n" +
                "3 - Ele bebeu uma poção de life\n" +
                "4 - Cansei, quero sair");
    }
}

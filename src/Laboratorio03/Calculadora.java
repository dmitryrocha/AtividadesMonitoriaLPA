package Laboratorio03;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        //Declaramos as variáveis
        int numero1, numero2,resultado;

        //Criamos um scanner chamado fernando que vai ler o que o usuário escrever
        Scanner fernando = new Scanner(System.in);

        //agora pedimos para o usuário escrever os números que realizarão os cálculos
        System.out.println("Qual o primeiro número?");
        numero1 = fernando.nextInt();
        while(numero1<0){
            System.out.println("Número inserido está fora dos parâmetros. Favor tentar novamente:");
            numero1 = fernando.nextInt();
        }
        System.out.println("Qual o segundo número?");
        numero2 = fernando.nextInt();
        while(numero2<0){
            System.out.println("Número inserido está fora dos parâmetros. Favor tentar novamente:");
            numero2 = fernando.nextInt();
        }

        //por fim usamos os números registrados nas variáveis para realizar as contas.
        resultado=numero1+numero2;
        System.out.println("A soma é: "+resultado);
        resultado=numero1-numero2;
        System.out.println("a subtração é: "+resultado);
        resultado=numero1*numero2;
        System.out.println("a multiplicação é: "+resultado);
        resultado=numero1/numero2;
        System.out.println("a divisão é: "+resultado);

    }
}

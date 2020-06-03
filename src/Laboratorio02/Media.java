package Laboratorio02;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        //Aqui declaramos as variáveis
        double nota1, nota2, resultado;
        //Declaramos os pesos das notas para usarmos nas médias ponderadas
        double peso1 = 3;
        double peso3 = 4;


        //Criamos aqui o scanner que lerá as notas do aluno
        Scanner sc = new Scanner(System.in);

        //pedimos que o scanner leia o que o usuário escreveu e armazene estes números nas variáveis
        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = sc.nextDouble();



        //calculando a média ponderada. Lembrando de usar parênteses para fazer tudo na ordem certa
        resultado = ((nota1*peso1) + (nota2*peso3))/(peso1+peso3);
        System.out.println("A média ponderada é: "+resultado);

        //Novamente veremos se a pessoa passou ou não usando if e else
        if(resultado >= 6) {
            System.out.println("Aprovado");
        } else if (resultado > 4 && resultado < 6) {
            System.out.println("Prova final");
        } else {
            System.out.println("Reprovado");
        }
    }
}

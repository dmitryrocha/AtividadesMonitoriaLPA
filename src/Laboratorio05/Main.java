package Laboratorio05;

public class Main {
    public static void main(String[] args) {
        double salarioInicial;

        System.out.println("Um salário de R$ 1.000,00");
        salarioInicial = 1000.00;
        CalculoDesconto(salarioInicial);
        System.out.println();
        System.out.println("Um salário de R$ 5.000,00");
        salarioInicial = 5000.00;
        CalculoDesconto(salarioInicial);
        System.out.println();
        System.out.println("Um salário de R$ -1.000,00");
        salarioInicial = -1000.00;
        CalculoDesconto(salarioInicial);
        System.out.println();

    }
     public static void CalculoDesconto(double salarioInicial){
         final double percentual = 0.11;
         double salarioLiquido;
         System.out.println("Se seu salário inicial é R$ "+salarioInicial);
                double desconto = salarioInicial*percentual;
                if (desconto > 318.20) {
                    salarioLiquido = salarioInicial-318.20;
                    System.out.println("O desconto do seu salário seria de R$ "+ desconto +" mas na verdade é de R$ 318.20");
                    System.out.println("Seu salário, retirado o desconto previdenciário é de R$ " + salarioLiquido);
                } else if (desconto <= 318.20 && desconto >=0) {
                    salarioLiquido = salarioInicial - desconto;
                    System.out.println("O desconto do seu salário é de R$ "+desconto);
                    System.out.println("Seu salário, retirado o desconto previdenciário é de R$ " + salarioLiquido);
                } else {
                    System.out.println("Valores inválidos!");
                }

            }

        }







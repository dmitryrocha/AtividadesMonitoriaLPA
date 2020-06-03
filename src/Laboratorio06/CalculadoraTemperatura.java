package Laboratorio06;

import java.util.Scanner;

public class CalculadoraTemperatura {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Qual a temperatura de entrada?");
        double tempEntrada = sc.nextDouble();
        int opcao = menu();
        convert(opcao,tempEntrada);
    }

    public static int menu() {
        System.out.println("Favor escolha uma das opções para converter temperaruras:" +
                "\n 1 - Para calcular de Celsius para Fahrenheit" +
                "\n 2 - Para calcular de Celsius para Kelvin" +
                "\n 3 - Para calcular de Fahrenheit para Celsius" +
                "\n 4 - Para calcular de Fahrenheit para Kelvin" +
                "\n 5 - Para calcular de Kelvin para Celsius" +
                "\n 6 - Para calcular de Kelvin para Fahrenheit");
        int escolha = sc.nextInt();
        while(escolha < 1 || escolha > 7) {
            System.out.println("Você precisa escolher um número de 1 a 7. Tente novamente");
            System.out.println("Favor escolha uma das opções para converter temperaruras:" +
                    "\n 1 - Para calcular de Celsius para Fahrenheit" +
                    "\n 2 - Para calcular de Celsius para Kelvin" +
                    "\n 3 - Para calcular de Fahrenheit para Celsius" +
                    "\n 4 - Para calcular de Fahrenheit para Kelvin" +
                    "\n 5 - Para calcular de Kelvin para Celsius" +
                    "\n 6 - Para calcular de Kelvin para Fahrenheit");
            escolha = sc.nextInt();
        }
        return escolha;
    }

    public static void convert (int opcao, double tempEntrada) {
        switch(opcao) {
            case 1:
                System.out.println("A conversão de "+tempEntrada+"º Celsius para Fahrenheit é "+converterCF(tempEntrada));
                break;
            case 2:
                System.out.println("A conversão de "+tempEntrada+"º Celsius para Kelvin é "+converterCK(tempEntrada));
                break;
            case 3:
                System.out.println("A conversao de "+tempEntrada+"º Fahrenheit para Celsius é "+converterFC(tempEntrada));
                break;
            case 4:
                System.out.println("A conversao de "+tempEntrada+"º Fahrenheit para Celsius é "+converterFK(tempEntrada));
                break;
            case 5:
                System.out.println("A conversao de "+tempEntrada+"º Kelvin para Celsius é "+converterKC(tempEntrada));
                break;
            case 6:
                System.out.println("A conversao de "+tempEntrada+"º Kelvin para Fahrenheit é "+converterKF(tempEntrada));
                break;
        }
    }

    public static double converterCF (double tempEntrada) {
        double tempFahrenheit = 0;
        tempFahrenheit = (1.8*tempEntrada)+32;
        return tempFahrenheit;
    }

    public static double converterCK (double tempEntrada) {
        double tempKelvin = 0;
        tempKelvin = tempEntrada +273.15;
        return tempKelvin;
    }

    public static double converterFC (double tempEntrada) {
        double tempCelsius = 0;
        tempCelsius = (tempEntrada-32)/1.8;
        return tempCelsius;
    }

    public static double converterFK (double tempEntrada) {
        double tempKelvin = 0, tempCelsius = 0;
        tempCelsius = converterFC(tempEntrada);
        tempKelvin = tempCelsius - 273.15;
        return tempKelvin;
    }

    public static double converterKC (double tempEntrada) {
        double tempCelsius = 0;
        tempCelsius = tempEntrada - 273.15;
        return tempCelsius;
    }

    public static double converterKF (double tempEntrada) {
        double tempFahrenheit = 0, tempCelsius = 0;
        tempCelsius = converterKC(tempEntrada);
        tempFahrenheit = converterCF(tempCelsius);
        return tempFahrenheit;
    }
}

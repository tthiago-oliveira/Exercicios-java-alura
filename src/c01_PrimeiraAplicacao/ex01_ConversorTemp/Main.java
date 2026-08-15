package c01_PrimeiraAplicacao.ex01_ConversorTemp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("informe a temperatura atual em ºC: ");

        double temperatura = sc.nextDouble();


        //calculo de conversao
        double temperaturaConvertidaF = (temperatura * 1.8) + 32;

        double temperaturaConvertidaK = temperatura + 273.15;


        //loop para garantir que o usuario escolha uma opção valida
        while (true) {

            System.out.println("Você quer a resposta em ºF ou K? (Fahrenheit / Kelvin): ");

            String resposta = sc.next();


            //condicional que aceira tanto as formas abreviadas com e sem grau e a forma extensa
            if (resposta.equalsIgnoreCase("ºF") || resposta.equalsIgnoreCase("F")
                    || resposta.equalsIgnoreCase("fahrenheit")) {

                System.out.println("A temperatura em ºF é: " + temperaturaConvertidaF);

                break;//sai do loop por responder correto


            //segunda condicional que aceita
            } else if (resposta.equalsIgnoreCase("K") || resposta.equalsIgnoreCase("Kelvin")) {

                System.out.println("A temperatura em K é: " + temperaturaConvertidaK);

                break;


            } else {

                System.out.println("Opção inválida! Por favor, informe um termo válido " +
                        "(ex: F, K, Fahrenheit ou Kelvin).\n"); //e repete o loop

            }

        }

        sc.close();

    }

}

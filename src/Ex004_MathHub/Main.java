package Ex004_MathHub;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);

        String choice;
        String name;

        System.out.println("Bem vindo a MathHub!!!");
        System.out.println("por favor informe o seu nome: ");
        name = sc.nextLine();

        String options = """
                         Seja bem vindo %s!!T Temos varias opções de contas e comparações
                         |----------------------------------------------------------------------------------|
                         1. Tabuada     | sistema para informa a tabuada de um determinado número inteiro
                         2. Comparação  | sistema para comparar dois numeros e informa informações sobre ele
                         3. Fatorial    | sistema para informa o fatorial de um determinado número inteiro
                         4. Area        | sistema para descobrir a area de um quadrado ou círculo
                         Por gentileza informe o nome ou o número do que você gostaria de experimentar""".formatted(name);
        System.out.println(options);
        while (true){
        choice = sc.nextLine();
        int choiceNumb;

        switch (choice.trim().toLowerCase()) {
            case "tabuada":
            case "1":
                System.out.println("perfeito %s, informe para o número para eu informa a tabuada de 1 a 10"
                        .formatted(name));
                choiceNumb = sc.nextInt();

                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d X %d = %dta%n", choiceNumb, i, (choiceNumb * i));
                }

                break;

            case "comparação":
            case "comparacao":
            case "2":

                System.out.println("perfeito %s informe o primeiro número, para receber informações entre eles:");
                int numberOne = sc.nextInt();

                System.out.println("Agora informe o segundo número:");
                int numberTwo = sc.nextInt();

                if (numberOne>numberTwo){

                }
                break;

            case "fatorial":
            case "3":
                break;
            case "area":
            case "4":
                break;
            default:
        }
        }

    }
}

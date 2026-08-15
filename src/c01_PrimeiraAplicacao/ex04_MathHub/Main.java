package c01_PrimeiraAplicacao.ex04_MathHub;

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
                         2. Comparação  | sistema para comparar dois numeros e mostrar informações sobre eles
                         3. Fatorial    | sistema para informa o fatorial de um determinado número inteiro
                         4. Area        | sistema para descobrir a area de um quadrado ou círculo
                         Por gentileza informe o nome ou o número do que você gostaria de experimentar""".formatted(name);
        System.out.println(options);

        while (true){
        choice = sc.nextLine();

        switch (choice.trim().toLowerCase()) {
            case "tabuada":
            case "1":
                System.out.printf("perfeito %s, informe para o número para eu informa a tabuada de 1 a 10%n",name);
                int choiceNumb = sc.nextInt();

                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d X %d = %dta%n", choiceNumb, i, (choiceNumb * i));
                }

                break;

            case "comparação":
            case "comparacao":
            case "2":

                String resultadoComparacao;
                String resultadoParImpar;
                String resultadoSinal;

                System.out.println(("perfeito %s informe o primeiro número," +
                        " para receber informações entre eles:").formatted(name));
                int numberOne = sc.nextInt();

                System.out.println("Agora informe o segundo número:");
                int numberTwo = sc.nextInt();

                if (numberOne>numberTwo){
                    resultadoComparacao = "O número %d é maior que %d".formatted(numberOne,numberTwo);
                } else if (numberTwo>numberOne) {
                    resultadoComparacao = "O número %d é maior que %d".formatted(numberTwo,numberOne);
                }else{
                    resultadoComparacao = "os dois números são iguais %d".formatted(numberOne);
                }

                String parImparN1 = (numberOne % 2 == 0) ? "Par" : "Ímpar";
                String parImparN2 = (numberTwo % 2 == 0) ? "Par" : "Ímpar";
                resultadoParImpar = "%d é %s | %d é %s".formatted(numberOne,parImparN1,numberTwo,parImparN2);

                String sinalN1 = (numberOne >= 0) ? "Positivo" : "Negativo";
                String sinalN2 = (numberTwo >= 0) ? "Positivo" : "Negativo";
                resultadoSinal = "%d é %s | %d é %s".formatted(numberOne,sinalN1,numberTwo,sinalN2);

                String relatorio = """
                                                  INFORMAÇÕES OBTIDAS
                                   ----------------------------------------------------
                                   Análise          | Resultado                        
                                   ----------------------------------------------------
                                   Maior / Menor    | %s
                                   Par / Ímpar      | %s
                                   Sinal ( + / - )  | %s                               
                                   
                                   """.formatted(resultadoComparacao,resultadoParImpar,resultadoSinal);

                System.out.println(relatorio);
                break;

            case "fatorial":
            case "3":
                int numberFat;
                System.out.printf("Perfeito %s, informe o número para calcular o fatorial: %n",name);
                numberFat = sc.nextInt();

                int resultado = fatorial(numberFat);

                System.out.println("o fatorial de %d é %d".formatted(numberFat,resultado));

                break;

            case "area":
            case "4":
                int escolha = 0;
                while (escolha != 3) {
                    System.out.println("-----Menu-----");
                    System.out.println("1. Calcular área do quadrado");
                    System.out.println("2. Calcular área do círculo");
                    System.out.println("3. Sair");
                    System.out.print("Escolha uma opção: ");
                    escolha = sc.nextInt();

                    if (escolha == 1) {
                        System.out.print("Digite o lado do quadrado: ");
                        double lado = sc.nextDouble();
                        double areaQuadrado = lado * lado;
                        System.out.println("Área do quadrado: " + areaQuadrado);
                    } else if (escolha == 2) {
                        System.out.print("Digite o raio do círculo: ");
                        double raio = sc.nextDouble();
                        double areaCirculo = 3.14 * raio * raio;
                        System.out.println("Área do círculo: " + areaCirculo);
                    } else if (escolha == 3) {
                        System.out.println("Programa encerrado.");
                        break;
                    } else {
                        System.out.println("Opção inválida. Tente novamente.");
                    }
                }

                break;
            default:
        }
        }

    }
    // função para calcular o fatorial
    public static int fatorial(int n) {
        return (n == 1 || n == 0) ? 1 : n * fatorial(n - 1);
    }// ele vai visualizar se o numero é 0 ou 1 para retorna 1 se não for ele ira multiplicar pelo antecessor
}

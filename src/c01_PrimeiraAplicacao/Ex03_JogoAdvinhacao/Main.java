package c01_PrimeiraAplicacao.Ex03_JogoAdvinhacao;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();
        int roleta = gerador.nextInt(101);
        int escolha = 0;
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            escolha = sc.nextInt();
            tentativas++;

            if (escolha == roleta) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                System.out.println("gostaria de jogar novamente: (Y ou N)");
                while (true) {
                    String resposta = sc.next();
                    if (resposta.equalsIgnoreCase("N")) {
                        break;
                    } else if (resposta.equalsIgnoreCase("Y")) {
                        tentativas = 0;
                        break;
                    }
                    System.out.println("porfavor digite somente N ou Y: ");
                }

            } else if (escolha < roleta) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }


            if (tentativas == 5 && escolha != roleta) {
                System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + roleta);
                System.out.println("gostaria de jogar novamente: (Y ou N)");
                while (true) {
                    String resposta = sc.next();
                    if (resposta.equalsIgnoreCase("N")) {
                        break;
                    } else if (resposta.equalsIgnoreCase("Y")) {
                        tentativas = 0;
                        break;
                    }
                    System.out.println("porfavor digite somente N ou Y: ");
                }
            }
        }
    }
}


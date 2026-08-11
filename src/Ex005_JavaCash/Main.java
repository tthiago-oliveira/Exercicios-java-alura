package Ex005_JavaCash;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        double saldo = rand.nextDouble(5001);
        String name;
        String choice;

        System.out.println("seja bem vindo, diga o seu nome para cadastro: ");
        name = sc.nextLine();

        String conta = """
                        ****************************************
                        Dados do cliente:
                                                            
                        Nome:                |%s            
                        Tipo conta:          |Corrente      
                        Saldo da conta:      |R$: %.2f        
                        ****************************************
                        """.formatted(name,saldo);

        String operations = """
                            Operações
                            
                            1- Consultar saldos
                            2- Receber valor
                            3- Tranferir valor
                            4- sair
                            
                            Digite a opção desejada:
                            """;

        System.out.println(conta);

        while (true) {
            System.out.println(operations);

            choice = sc.nextLine();

            switch (choice.trim().toLowerCase()) {
                case "consultar saldos":
                case "consultarsaldos":
                case "consultar":
                case "1":
                    System.out.println("seu saldo é R$: %.2f".formatted(saldo));
                    break;

                case "receber":
                case "receber valor":
                case "2":
                    System.out.println("escolha o valor a receber:");
                    double recebSaldo = sc.nextDouble();
                    sc.nextLine();

                    saldo += recebSaldo;
                    System.out.println("seu saldo agora é R$: %.2f".formatted(saldo));
                    break;

                case "transferir valor":
                case "transferirvalor":
                case "transferir":
                case "3":

                    System.out.println("escolha o valor para transferir: ");
                    double transfSaldo = sc.nextDouble();
                    sc.nextLine();

                    if (saldo > transfSaldo) {
                        saldo -= transfSaldo;
                        System.out.println("tranferencia realida!!\n Seu saldo agora é R$: %.2f".formatted(saldo));
                        break;
                    } else {
                        System.out.println("saldo insuficiente\n escolha um valor de até R$: %.2f".formatted(saldo));
                        break;
                    }
                case "sair":
                case "4":
                    System.out.println("Volte logo!!");
                    sc.close();
                    return;

                default:
                    System.out.println("Porfavor escolha uma opção valida");
                    break;
            }
        }
    }
}

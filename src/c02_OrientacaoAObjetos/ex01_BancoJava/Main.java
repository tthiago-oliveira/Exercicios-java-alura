package c02_OrientacaoAObjetos.ex01_BancoJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person infP = new Person();
        BankAccount infBk = new BankAccount();
        MenuUi MenuUI = new MenuUi();

        System.out.println("Ola digite seu nome:");
        infP.setName(sc.nextLine());

        System.out.println("Seja bem vindo %s Porfavor digite sua idade: ".formatted(infP.getName()));
        while (!infP.setAge(sc.nextInt())){
            System.out.println("tente novamente. Digite sua idade: ");
        }
        System.out.println("Cadastro realizado com sucesso.");

        while (true) {

            System.out.println("Você é Estudante S/N? (estudantes ganham desconto)");
            String response = sc.next().trim();

            if (response.equalsIgnoreCase("S")){
                infP.setStudent(true);
                break;
            } else if (response.equalsIgnoreCase("N")) {
                infP.setStudent(false);
                break;
            }else {
                System.out.println("Opção inválida! Digite apenas S para sim ou N para não.");
                sc.nextLine();
            }

        }
        // Exibe mensagem inicial de boas-vindas na caixa
        MenuUI.exibirCaixaTexto("BEM-VINDO AO BANCO JAVA");

        // Lógica de cadastro (Pessoa, Conta, CPF...)

        boolean rodando = true;
        while (rodando) {
            MenuUI.exibirMenuPrincipal();
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> MenuUI.exibirCaixaTexto("Você trabalhou e ganhou R$ 150!");
                case 2 -> System.out.println("Saldo atual: R$ ".formatted(infBk.getBalance()));
                case 4 -> rodando = false;
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}

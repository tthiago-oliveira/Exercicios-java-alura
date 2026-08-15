package c01_PrimeiraAplicacao.Ex02_VariaveisECasting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá bem vindo a SuperStore!!");
        System.out.println("Porfavor diga-me seu nome!");
        String name = sc.next();

            System.out.println("\nPoderia nos informar se você gostaria de comprar em 'real' ou 'dolar'?");

        //loop para definir a moeda
        String money;
        while (true) {
            money = sc.next();
            // Aceita real / dolar ignorando maiúsculas e minúsculas
            if (money.equalsIgnoreCase("real") || money.equalsIgnoreCase("dolar")) {
                break; //Sai do loop da moeda.
            } else {
                System.out.println("Opção inválida! Só possuímos essas duas cotações (real ou dolar). Tente novamente.");
            }// repete o loop
        }

        char catalog;

            System.out.println("\nSeja bem-vindo " + name + "! Possuimos dois catalogos: um Nacional e um Internacional.");
            System.out.println("qual você gostaria de utilizar primeiro? poderia informar a inicial do catalogo?" +
                    " ex: N (nacional) I (internacinal)");

        //loop para definir o catalogo
        while (true) {
            catalog = sc.next().charAt(0);


            if (catalog == 'N' || catalog == 'n') {
                System.out.println("Perfeito!! para os itens nacionais possuimos Moveis");

                //Concatenação de char e String
                String informacaoMoedaECatalogo = """
                                                  Catálogo escolhido: %c  | Moeda selecionada: %s
                                                  
                                                  Produtos               | Valor do produto
                                                  -----------------------|-----------------------
                                                  cadeira                | R$150
                                                  Cama                   | R$500
                                                  """.formatted(catalog, money);
                System.out.println(informacaoMoedaECatalogo);
                break; //Sai do loop e segue a compra.

            } else if (catalog == 'I' || catalog == 'i') {
                System.out.println("Perfeito!! para os itens internacionais possuimos Eletronicos");

                //Concatenação de char e String
                String informacaoMoedaECatalogo = """
                                                  Catálogo escolhido: %c  | Moeda selecionada: %s
                                                  -----------------------|-----------------------
                                                  Produtos               | Valor do produto
                                                  Celular                | U$1,500
                                                  Computador             | U$3,500
                                                  """.formatted(catalog, money);
                System.out.println(informacaoMoedaECatalogo);
                break; //Sai do loop e segue a compra.

            } else {
                System.out.println("Opção inválida! Por favor, informe um catálogo válido " +
                        "(ex: N ou I).");
            }
        }

    }

}

package c02_OrientacaoAObjetos.ex01_BancoJava;

public class MenuUi {

    //sistema para desenhar caixas de texto em volta de uma mensagem
    public static void exibirCaixaTexto(String mensagem) {
        String borda = "+" + "-".repeat(mensagem.length() + 4) + "+";
        System.out.println(borda);
        System.out.println("|  " + mensagem + "  |");
        System.out.println(borda);
    }

    // menu principal
    public static void exibirMenuPrincipal() {
        System.out.println("\n===== BANCO JAVA =====");
        System.out.println("1. Trabalhar");
        System.out.println("2. Ver Saldo");
        System.out.println("3. Ir à Loja");
        System.out.println("4. Sair");
        System.out.println("======================");
        System.out.print("Escolha uma opção: ");
    }
}


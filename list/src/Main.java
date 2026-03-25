import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("--- MENU ---");
            System.out.println("1 Adicionar Produto");
            System.out.println("2 Listar Produtos");
            System.out.println("3 Atualizar Preço");
            System.out.println("4 Deletar Produto");
            System.out.println("5 Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Preço: ");


        sc.close();
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciarPessoa manager = new GerenciarPessoa();
        Scanner scanner = new Scanner(System.in);
        int opcao=0;

        while (opcao!=4) {
            System.out.println("\nMenu:");
            System.out.println("1. Salvar uma pessoa");
            System.out.println("2. Listar todas as pessoas");
            System.out.println("3. Deletar uma pessoa pelo e-mail");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o e-mail: ");
                    String email = scanner.nextLine();
                    manager.salvarPessoa(new Pessoa(nome, email));
                    break;
                case 2:
                    manager.listarPessoas();
                    break;
                case 3:
                    System.out.print("Digite o e-mail da pessoa a ser deletada: ");
                    String emailParaDeletar = scanner.nextLine();
                    manager.deletarPessoa(emailParaDeletar);
                    break;
                case 4:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}


import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        funcoes fc = new funcoes();
        System.out.println("...");
        fc.enter();
        Thread.sleep(1000);
        fc.print_robo("Olá");
        fc.enter();
        fc.print_robo("Meu nome é: R2D2...");
        fc.enter();
        while (true) {
            fc.print_robo("Insira o caminho do arquivo CSV que deseja que eu leia:");
            String arquivo = sc.next();
            String novo_arquivo = fc.tratar_arquivo(arquivo);
            fc.print_robo("Ok...");
            fc.enter();
            fc.print_robo("Insira o nome do arquivo:");
            String nome = sc.next();
            fc.print_robo("Lendo arquivo...");
            fc.ler(novo_arquivo, nome);
            String escolha = fc.continuar();
            if (! escolha.equalsIgnoreCase("true")) {
                break;
            }
        }
    }
}
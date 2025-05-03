import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TODO: CONHECER E IMPORTAR A CLASSE SCANNER
        //EXIBIR AS MESAGEMS PARA NOSSO USUARIOS
        //OBTER PELA CLASSE SCANNER OS VALOES VALORES DIGITADOS NO TERMINAL
        //EXIBER A MENSAGEM CONTA CRIADA 

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta !");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque.");

        scanner.close();
    }
}


    


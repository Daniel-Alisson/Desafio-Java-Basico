import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nome_cliente;
        double saldo;

        System.out.println("BEM VINDO AO NOSSO BANCO!!");
        System.out.println("INFORME OS DADOS A SEGUIR PARA REALIZAR O SEU CADASTRO\n");
        System.out.print("Informe o número da conta: ");
        numero = sc.nextInt();
        System.out.print("Informe o número da Agência: ");
        agencia = sc.next();
        System.out.print("Informe o seu nome: ");
        sc.nextLine();
        nome_cliente = sc.nextLine();
        System.out.print("Informe o saldo a ser depositado: ");
        saldo = sc.nextDouble();

        System.out.print("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco");
        System.out.print(", sua agência é " + agencia + ", conta " + numero);
        System.out.print(" e o seu saldo R$ " + saldo + " já está disponível para saque");
    }
}

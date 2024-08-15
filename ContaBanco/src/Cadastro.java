import java.util.Scanner;

public class Cadastro {
    Scanner sc = new Scanner(System.in);

    private int numero;
    private String agencia;
    private String nome_cliente;
    private double saldo;

    public void introducao() {
        System.out.println("BEM VINDO AO NOSSO BANCO!!");
        System.out.println("INFORME OS DADOS A SEGUIR PARA REALIZAR O SEU CADASTRO\n");
    }

    public int inserirNumero() {
        System.out.print("Informe o número da conta: ");
        numero = sc.nextInt();
        return numero;
    }

    public String inserirAgencia() {
        System.out.print("Informe o número da Agência: ");
        agencia = sc.next();
        return agencia;
    }
    // A função next() só armazena o primeiro nome, então vou utilizar o nextLine() para o caso de escrever o nome inteiro
    public String inserirNome() {
        System.out.print("Informe o seu nome: ");
        sc.nextLine();
        nome_cliente = sc.nextLine();
        return nome_cliente;
    }

    public double inserirSaldo() {
        System.out.print("Informe o saldo a ser depositado: ");
        saldo = sc.nextDouble();
        return saldo;
    }

    public void listagem() {
        System.out.println("");
        System.out.print("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco");
        System.out.print(", sua agência é " + agencia + ", conta " + numero);
        System.out.print(" e o seu saldo R$ " + saldo + " já está disponível para saque");
    }
}

public class ContaTerminal {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();

        cadastro.introducao();
        cadastro.inserirNumero();
        cadastro.inserirAgencia();
        cadastro.inserirNome();
        cadastro.inserirSaldo();
        cadastro.listagem();
    }
}

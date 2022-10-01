import bancodigital.Cliente;
import bancodigital.Conta;
import bancodigital.ContaCorrente;
import bancodigital.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Murilo");

        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente1);

        contaCorrente.depositar(100);
        contaCorrente.transferir(200,poupanca);
    }
}
class ContaBancaria {
protected double saldo;
public void depositar(double valor) {
saldo += valor;
System.out.println("Depósito realizado. Saldo: R$ " + saldo);
}
}
class ContaCorrente extends ContaBancaria {
}   

public class Main {
    public static void main(String[] args) {
        double valor = 100.00;

        ContaCorrente corrente = new ContaCorrente();
        corrente.depositar(valor - 1.00);
    }
}

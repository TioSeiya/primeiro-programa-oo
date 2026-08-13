public class Main { //classe
public static void main(String[] args) {
System.out.println("Meu primeiro programa Java!");
}
}

interface MeioDePagamento {
void pagar(double valor);
}
class Pix implements MeioDePagamento {  //classe, Interface , Polimorfismo
@Override
public void pagar(double valor) {
System.out.println("Pagamento de R$ " + valor + " realizado via Pix.");
}
}
class Cartao implements MeioDePagamento {    //classe 
@Override
public void pagar(double valor) {
System.out.println("Pagamento de R$ " + valor + " realizado com
cartão.");
}
class Boleto implements MeioDePagamento {  //classe
@Override
public void pagar(double valor) {
System.out.println("Pagamento de R$ " + valor + " realizado com
Boleto.");
}
    
}
public class Main {   
public static void main(String[] args) {
MeioDePagamento pagamento = new Pix(); //Criação de objeto
pagamento.pagar(100.00);
pagamento = new Cartao();
pagamento.pagar(250.00);
pagamento = new Boleto();
pagamento.pagar(80.00);    
}
}

class ContaBancaria {    //classe, Encapsulamento
protected double saldo;
public void depositar(double valor) {
saldo += valor; // Atributo
System.out.println("Depósito realizado. Saldo: R$ " + saldo);
}
    
class ContaPoupanca extends ContaBancaria {    //Herança
}
public class Main {
public static void main(String[] args) {
ContaPoupanca poupanca = new ContaPoupanca();
poupanca.depositar(100.00);
}
}
    
}
class ContaCorrente extends ContaBancaria {    //Herança
}   

public class Main {
    public static void main(String[] args) {
        double valor = 100.00;

        ContaCorrente corrente = new ContaCorrente();
        corrente.depositar(valor - 1.00);
    }
}

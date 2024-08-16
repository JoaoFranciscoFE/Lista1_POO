public class Questao10 {
    public static void main(String[] args){
        double saldo = 500.50;
        System.out.printf("Saldo atual: %.2f\n", saldo);
        double deposito = 300.25;
        System.out.printf("Saldo + depósito: %.2f\n", saldo + deposito);
        double saque = 150.75;
        System.out.printf("Saldo após saque: %.2f", saldo + deposito - saque);
    }
}

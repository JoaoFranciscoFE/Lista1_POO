import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        if(num % 2 == 0) {
            System.out.print("Este número é par");
        } else {
            System.out.print("Este número não é par");
        }
    }
}

import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        if(num >= 0 && num <= 10){
          System.out.print("Este número está entre 0 e 10");

        } else {
            System.out.print("Este número não está entre 0 e 10");
        }
    }
}

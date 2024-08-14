import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        int nota1 = type.nextInt();

        System.out.print("Digite a segunda nota: ");
        int nota2 = type.nextInt();

        int media = (nota1 + nota2) / 2;

        if (media == 10) {
            System.out.println("Você teve a média máxima, logo foi aprovado com distinção");
        } else if (media >= 7) {
            System.out.printf("Você ficou com média %d e foi aprovado", media);
        } else {
            System.out.printf("Você ficou com média %d e foi reprovado", media);
        }

        type.close();
    }
}

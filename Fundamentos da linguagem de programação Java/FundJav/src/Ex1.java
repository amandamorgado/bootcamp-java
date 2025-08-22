import java.util.Scanner;
public class Ex1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        var nome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        var idade = entrada.nextInt();
        System.out.printf("Olá %s. Você tem %d anos", nome, idade);
    }
}

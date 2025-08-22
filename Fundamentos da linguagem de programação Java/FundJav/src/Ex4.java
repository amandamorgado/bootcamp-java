import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual seu nome e qual sua idade?: ");
        String nome = input.next();
        int idade = input.nextInt();
        System.out.print("Qual seu nome e qual sua idade?: ");
        String nome2 = input.next();
        int idade2 = input.nextInt();

        int dif = idade-idade2;
            if (dif<0){
                dif = -dif;
            }
        System.out.printf("Olá %s e %s, a diferença de idade de vocês é de %d anos", nome, nome2, dif);
    }
}

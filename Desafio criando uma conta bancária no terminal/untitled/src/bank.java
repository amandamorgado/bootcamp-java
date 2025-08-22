import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite sua agência: ");
        String agencia = entrada.nextLine();
        System.out.print("Digite o número da sua conta: ");
        int conta = entrada.nextInt();
        System.out.print("Digite o seu saldo: ");
        float saldo = entrada.nextFloat();
        System.out.println("Olá " + nome + ", obrigada por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de " + saldo + " já está disponível para saque");
    }
}

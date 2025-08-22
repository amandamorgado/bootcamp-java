import java.util.Scanner;
public class Ex3 {

    public static void main (String[] args){

        Scanner imput = new Scanner(System.in);
        System.out.print("Qual o tamanho da base e da altura do seu retângulo?: ");
        var base = imput.nextInt();
        var altura = imput.nextInt();
        var area = base*altura;
        System.out.printf("A area do seu retângulo é de %d", area);

    }
}

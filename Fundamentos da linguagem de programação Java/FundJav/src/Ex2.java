import java.util.Scanner;
public class Ex2 {

    public static void main (String[] args){
        Scanner imput = new Scanner(System.in);
        System.out.print("Qual o tamanho do lado do quadrado?: ");
        var lado = imput.nextInt();
        var area = lado*lado;
        System.out.printf("A área do seu quadrado é de %d \n", area);

    }
}

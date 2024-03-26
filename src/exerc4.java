import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        //Construa um programa em Java para ler dois valores e mostrar o
        //menor deles. (DICA: Usar if/else para mostrar o menor dos valores digitados)

        Scanner scan = new Scanner(System.in);

        int num1;
        System.out.println("Insira o primeiro valor: ");
        num1 = scan.nextInt();

        int num2;
        System.out.println("Insira o segundo valor: ");
        num2 = scan.nextInt();

        if (num1 < num2) {
            System.out.println(num1 + " é menor que " + num2);
        } else {
            System.out.println(num2 + " é menor que " + num1);
        }
    }
}

import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        //Construa um programa em Java para ler dois valores e mostrar o
        //maior deles. (DICA: Usar if/else para mostrar o maior dos valores digitados)

        Scanner scan = new Scanner(System.in);

        int num1;
        System.out.println("Insira o primeiro valor: ");
        num1 = scan.nextInt();

        int num2;
        System.out.println("Insira o segundo valor: ");
        num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        } else {
            System.out.println(num2 + " é maior que " + num1);
        }
    }
}

import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {
        //Construa um programa em Java para ler um valor, verificar se é par
        //ou ímpar e mostrar essa informação. (DICA: Usar if/else e o operador aritmético % para
        //mostrar se valor é par ou ímpar. Ex. (valor % 2 == 0) é par...)

        Scanner scan = new Scanner(System.in);

        int num;
        System.out.println("Insira um valor: ");
        num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " é PAR!");
        } else {
            System.out.println(num + " é IMPAR!");
        }
    }
}

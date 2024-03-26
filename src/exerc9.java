import java.util.Scanner;

public class exerc9 {
    public static void main(String[] args) {
        //Laranjas em um mercado de produtos orgânicos custam R$ 0,30 se
        //forem compradas menos que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze.
        //Construa um programa em Java que leia o número de laranjas compradas, calcule e escreva o
        //valor total da compra. Implementar uma validação da quantidade de frutas a serem
        //compradas para evitar que seja lido um número de laranjas menor (negativo) ou igual a zero.
        //(DICA: utilizar “if-else” como estrutura de seleção e dados tipo “double” com duas casas
        //decimais (%.2f) para a representação dos preços a serem cobrados)

        Scanner scan = new Scanner(System.in);

        int quantLaranjas;
        System.out.println("Insira quantas laranjas foram compradas: ");
        quantLaranjas = scan.nextInt();

        if (quantLaranjas < 1) {
            System.out.println("Você não comprou nenhuma laranja :( ");
        } else {
            if (quantLaranjas < 12) {
                double total = quantLaranjas * 0.30;
                System.out.printf("O total deu RS %.2f", total);
            } else {
                double total = quantLaranjas * 0.25;
                System.out.printf("O total deu RS %.2f", total);
            }
        }
    }
}

import java.util.Scanner;

public class exerc6 {
    public static void main(String[] args) {
        //Construa um programa em Java para ler três valores que
        //representam três segmentos de reta. Verificar se com esses segmentos é possível compor
        //um triângulo e mostrar uma mensagem dizendo se é ou não possível. (DICA: Usar if/else e
        //operador lógico &&. Regra para ser um triângulo: (1 < 2 + 3) e (2 < 1 + 3) e (3 < 1 + 2), OU
        //SEJA, todos os lados devem ser menores que a soma dos outros dois lados)

        Scanner scan = new Scanner(System.in);

        int num1;
        System.out.println("Insira o primeiro valor: ");
        num1 = scan.nextInt();

        int num2;
        System.out.println("Insira o segundo valor: ");
        num2 = scan.nextInt();

        int num3;
        System.out.println("Insira o terceiro valor: ");
        num3 = scan.nextInt();

        if (num1 < num2 + num3 && num2 < num1 + num3 && num3 < num1 + num2) {
            System.out.println("É um triângulo!");
        } else {
            System.out.println("Não é um triângulo!");
        }
    }
}

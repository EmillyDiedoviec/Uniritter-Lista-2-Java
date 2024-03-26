import java.util.Scanner;

public class exerc8 {
    public static void main(String[] args) {
        //Construa um programa em Java para ler três valores para os lados de
        //um triângulo: A, B e C. Verificar se os lados fornecidos formam realmente um triângulo. Se
        //formar, deve ser indicado o tipo de triângulo: isósceles, escaleno ou equilátero. Para verificar
        //se os lados fornecidos formam um triângulo: A < B + C e B < A + C e C < A + B. Triângulo
        //isósceles: possui dois lados iguais (A=B ou A=C ou B=C). Triângulo escaleno: possui todos os
        //lados diferentes (A<>B e B<>C e A<>C). Triângulo equilátero: possui todos os lados iguais (A=B
        //e B=C). (DICA: utilizar “if-else” como estrutura de seleção e o operador lógico &&)

        Scanner scan = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Insira o primeiro valor: ");
        num1 = scan.nextInt();

        System.out.println("Insira o segundo valor: ");
        num2 = scan.nextInt();

        System.out.println("Insira o terceiro valor: ");
        num3 = scan.nextInt();

        if (num1 < num2 + num3 && num2 < num1 + num3 && num3 < num1 + num2) {
            if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("É um triângulo isósceles!");
            } else if (num1 != num2 && num2 != num3 && num1 != num3){
                System.out.println("É um triângulo escaleno!");
            } else if (num1 == num2 && num2 == num3){
                System.out.println("É um triângulo equilátero!");
            } else {
                System.out.println("Não é um triângulo");
            }
        }

    }
}

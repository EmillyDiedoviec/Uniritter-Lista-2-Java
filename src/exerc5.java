import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        //Construa um programa em Java para ler um valor, verificar se está no
        //intervalo (100, 200) e mostrar essa informação. (DICA: Usar if/else e operador lógico &&)

        Scanner scan = new Scanner(System.in);

        int num;
        System.out.println("Insira um valor: ");
        num = scan.nextInt();

        if (num > 100 && num < 200) {
            System.out.println(num + " está entre 100 e 200");
        } else {
            System.out.println(num + " NÃO está entre 100 e 200");
        }
    }
}

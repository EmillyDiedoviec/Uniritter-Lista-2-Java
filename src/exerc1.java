import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {
        //1. Construa um programa em Java para ler um valor, verificar se é
        //maior do que 100 e mostrar essa informação. (DICA: Usar if/else para mostrar se valor é >
        //ou < 100)

        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Insira um valor: ");
        num = scan.nextInt();

        if (num > 100) {
            System.out.println(num + " é MAIOR que 100");
        } else if (num == 100){
            System.out.println(num + " é 100");
        } else {
            System.out.println(num + " é MENOR que 100");
        }

    }
}

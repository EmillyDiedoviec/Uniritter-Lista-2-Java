import java.util.Scanner;

public class exerc10 {
    public static void main(String[] args) {
        //Produtos em uma mercearia possuem preços variados de acordo com
        //o tipo de produto e a quantidade a ser comprada. Implemente um programa em Java que
        //apresente a lista de produtos disponíveis juntamente com seus preços e solicite ao usuário
        //que escolha (1) o produto a ser comprado e (2) a quantidade escolhida do produto e informe
        //o valor da compra. Os produtos e seus preços são: banana (R$ 0,30 se forem compradas
        //menos que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze), laranja (R$ 0,40 se
        //forem compradas menos que uma dúzia, e R$ 0,35 se forem compradas pelo menos doze),
        //maçã (R$ 0,50 se forem compradas menos que uma dúzia, e R$ 0,45 se forem compradas pelo
        //menos doze), kiwi (R$ 0,40 se forem compradas menos que uma dúzia, e R$ 0,30 se forem
        //compradas pelo menos doze). (DICA: utilizar “if-else” e “switch()” como estruturas de
        //seleção, e dados tipo “double” com duas casas decimais (%.2f) para a representação dos
        //preços a serem cobrados. Utilizar um único “printf()” para montar o menu de opções
        //conforme ilustração abaixo)

        Scanner scan = new Scanner(System.in);

        int produto;
        float quanti, total;

        System.out.println("Qual produto deseja comprar? ");
        System.out.println("1 - Banana : menos que 12 = R$ 0,30; 12 ou mais = R$ 0,25;");
        System.out.println("2 - laranja : menos que 12 = R$ 0,50; 12 ou mais = R$ 0,45;");
        System.out.println("3 - maçã : menos que 12 = R$ 0,30; 12 ou mais = R$ 0,25;");
        System.out.println("4 - kiwi : menos que 12 = R$ 0,40; 12 ou mais = R$ 0,30;");
        System.out.println("0 - sair");
        produto = scan.nextInt();

        switch (produto) {
            case 1 :
                System.out.println("Quantas bananas deseja comprar? ");
                quanti = scan.nextInt();
                if (quanti > 12) {
                    total = quanti * 0.25F;
                    System.out.printf("%.0f bananas à R$ 0,25 a unidade = %.2f", quanti, total);

                } else {
                    total = quanti * 0.30F;
                    System.out.printf("%.0f bananas à R$ 0,30 a unidade = %.2f", quanti, total);
                }
                break;
            case 2:
                System.out.println("Quantas laranjas deseja comprar? ");
                quanti = scan.nextInt();
                if (quanti > 12) {
                    total = quanti * 0.45F;
                    System.out.printf("%.0f laranjas à R$ 0,45 a unidade = %.2f", quanti, total);

                } else {
                    total = quanti * 0.50F;
                    System.out.printf("%.0f laranjas à R$ 0,50 a unidade = %.2f", quanti, total);
                }
                break;
            case 3:
                System.out.println("Quantas maçãs deseja comprar? ");
                quanti = scan.nextInt();
                if (quanti > 12) {
                    total = quanti * 0.25F;
                    System.out.printf("%.0f maçãs à R$ 0,25 a unidade = %.2f", quanti, total);

                } else {
                    total = quanti * 0.30F;
                    System.out.printf("%.0f maçãs à R$ 0,30 a unidade = %.2f", quanti, total);
                }
                break;
            case 4:
                System.out.println("Quantas kiwis deseja comprar? ");
                quanti = scan.nextInt();
                if (quanti > 12) {
                    total = quanti * 0.30F;
                    System.out.printf("%.0f kiwis à R$ 0,30 a unidade = %.2f", quanti, total);

                } else {
                    total = quanti * 0.40F;
                    System.out.printf("%.0f kiwis à R$ 0,40 a unidade = %.2f", quanti, total);
                }
                break;
            case 0:
                System.out.printf("Operação finalizada!");
                break;
        }

    }
}

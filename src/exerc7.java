import java.util.Scanner;

public class exerc7 {
    public static void main(String[] args) {
        //Escreva um programa em Java para ler o número de eleitores de um
        //município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que
        //cada um representa em relação ao total de eleitores. (DICA: regra de três para calcular o
        //percentual de cada voto em relação ao número de eleitores que é 100%, ou seja, X = (brancos
        //ou nulos ou validos) * 100 / eleitores)

        Scanner scan = new Scanner(System.in);

        int eleitores;
        System.out.println("Insira a quantidade de eleitores: ");
        eleitores = scan.nextInt();

        int votosBrancos;
        System.out.println("Insira a quantidade de votos brancos: ");
        votosBrancos = scan.nextInt();

        int vototNulos;
        System.out.println("Insira a quantidade de votos brancos nulos: ");
        vototNulos = scan.nextInt();

        int votosValidos;
        System.out.println("Insira a quantidade votos válidos: ");
        votosValidos = scan.nextInt();

        System.out.println("Resultado:");

        int porceVotosbrancos = ((votosBrancos * 100) / eleitores);
        System.out.println(+ porceVotosbrancos + "% de votos brancos");

        int porceVotosNulos = ((vototNulos * 100) / eleitores);
            System.out.println(+ porceVotosNulos + "% de votos nulos");

        int porceVotosValidos = ((votosValidos * 100) / eleitores);
            System.out.println(+ porceVotosValidos + "% de votos válidos");


    }
}

import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) throws Exception {
    //5. Escreva um programa que vai ler a idade de 5 pessoas, o sistema vai mostrar quantas são maior ou iguais a 18 e quantas são de menor.
    Scanner ler = new Scanner(System.in);
    int qtMaior = 0;
    int qtMenor = 0;

    for (int i = 1; i <= 5; i++) {
        System.out.println("Diga idade da "+i+"ª pessoa: ");
        int idade = ler.nextInt();
        
        if (idade >= 18) {
            qtMaior++;
        } else {
            qtMenor++;
        }
    }
    System.out.println(qtMaior+" são maior de idade");
    System.out.println(qtMenor+" são menor de idade");
    //    if (idade >= 18) {
    //        System.out.println("Você é maior de idade!");
    //       int ab=ab+1;
    //    } else {
    //        System.out.println("Você é menor de idade");
    //        int ba=ba+1;
    //    }
    //System.out.println("Tem "+ab+" maiores de idade ");
    //System.out.println("Tem "+ba+" menores de idade ");

    ler.close();
    }
}


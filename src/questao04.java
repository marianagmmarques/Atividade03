import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) throws Exception {
    //4. Escreva um programa que vai ler uma palavra, se a palavra for diferente de "Java-2022" o retorno vai ser "Palavra Errada" se igual "Palavra Ok" 
    //a pessoa pode faze no máximo 5 tentativas de acertar a palavra.
    Scanner ler = new Scanner(System.in);
    String palavra = "";
    int i = 0;

    do {
        i++;
        System.out.println("Digite a palavra: Tentativa "+i+"/5");
        palavra = ler.nextLine();

        if (palavra.equals("Java-2022")) {
            System.out.println("Palavra OK");
        } else {
            System.out.println("Palavra Errada");
        }

    } while (!palavra.equals("Java-2022") && i < 5);
    // Enquanto a palavra for diferente de Java-2022 e o contador menor que 5 repita...

    //for (int i = 0; i < 5; i++) {
    //    System.out.println(i+" Tentativa");

    //    System.out.println("Digite a Palavra Passe:");
    //    String palavra = ler.nextLine();

    //    if (palavra.contentEquals("Java-2022")) {
    //        System.out.println("Palavra OK");
    //        break; //força sair do laço de repetição.
    //    } else {
    //        System.out.println("Palavra Errada! Tente de novo");
    //    }
    //}
    ler.close();
    }
}

